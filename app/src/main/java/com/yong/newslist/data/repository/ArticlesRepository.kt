package com.yong.newslist.data.repository

import com.yong.newslist.core.network.NewsNetwork
import com.yong.newslist.domain.model.Article
import com.yong.newslist.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class ArticlesRepository @Inject constructor(
    private val newsNetwork: NewsNetwork
) : NewsRepository {
    override fun getArticles(searchWord: String): Flow<List<Article>> =
        flow {
            emit(newsNetwork.getArticlesBySearchWord(searchWord))
        }

    override fun getSavedArticles(): Flow<List<Article>> {
        return flow { }
    }
}