package com.yong.newslist.core.network

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.yong.newslist.BuildConfig
import com.yong.newslist.domain.model.Article
import com.yong.newslist.domain.model.News
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import retrofit2.Retrofit
import retrofit2.http.GET
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import retrofit2.http.Query
import javax.inject.Inject
import javax.inject.Singleton

interface NewsNetworkService {
    @GET("everything/")
    suspend fun getNewsBySearchWord(
        @Query("q") searchWord: String,
        @Query("apiKey") apiKey: String = BuildConfig.NEWS_API_KEY
    ): NewsResponse<News>
}

interface NewsRemoteDataSource {
    suspend fun getArticlesBySearchWord(searchWord: String): List<Article>?
    suspend fun getArticlesBySortStrategy(strategy: String)
}

data class NewsResponse<T>(val data: T)

@Singleton
class NewsNetwork @Inject constructor(
    json: Json,
    client: OkHttpClient
) : NewsRemoteDataSource {
    private val networkApi = Retrofit.Builder()
        .baseUrl(BuildConfig.BASE_URL)
        .client(client)
        .addConverterFactory(
            @OptIn(ExperimentalSerializationApi::class)
            json.asConverterFactory("application/json".toMediaType())
        )
        .build()
        .create(NewsNetworkService::class.java)

    override suspend fun getArticlesBySearchWord(searchWord: String): List<Article>? =
        networkApi.getNewsBySearchWord(searchWord).data.articles

    override suspend fun getArticlesBySortStrategy(strategy: String) {}
}