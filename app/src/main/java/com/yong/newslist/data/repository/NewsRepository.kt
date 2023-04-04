package com.yong.newslist.data.repository

import com.yong.newslist.domain.model.News
import kotlinx.coroutines.flow.Flow

interface NewsRepository {

    suspend fun getNewsList(searchWord: String): Flow<News>

    suspend fun getSavedNewsList(): Flow<News>
}