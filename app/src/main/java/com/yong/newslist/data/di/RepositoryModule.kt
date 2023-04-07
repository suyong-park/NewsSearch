package com.yong.newslist.data.di

import com.yong.newslist.data.repository.ArticlesRepository
import com.yong.newslist.domain.repository.NewsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun provideNewsRepository(
        articlesRepository: ArticlesRepository
    ): NewsRepository
}