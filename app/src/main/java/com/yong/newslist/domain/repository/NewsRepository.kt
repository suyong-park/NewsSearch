package com.yong.newslist.domain.repository

import com.yong.newslist.domain.model.Article
import kotlinx.coroutines.flow.Flow

interface NewsRepository {

    fun getArticles(searchWord: String): Flow<List<Article>>

    fun getSavedArticles(): Flow<List<Article>>
}