package com.yong.newslist.data.di

import com.yong.newslist.data.repository.NewsRepository
import com.yong.newslist.domain.repository.NewsListRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun provideNewsRepository(
        newsRepository: NewsListRepository
    ): NewsRepository
}