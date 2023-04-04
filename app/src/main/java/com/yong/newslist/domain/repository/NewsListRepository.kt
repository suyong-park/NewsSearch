package com.yong.newslist.domain.repository

import com.yong.newslist.core.network.NewsListNetwork
import com.yong.newslist.data.repository.NewsRepository
import com.yong.newslist.domain.model.News
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class NewsListRepository @Inject constructor(
    private val newsListNetwork: NewsListNetwork
) : NewsRepository {
    override suspend fun getNewsList(searchWord: String): Flow<News> {
        return flow {
            emit(
                newsListNetwork.getNewsBySearchWord(searchWord)
            )
        }
    }

    override suspend fun getSavedNewsList(): Flow<News> {
        return flow {  }
    }
}