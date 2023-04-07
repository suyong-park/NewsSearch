package com.yong.newslist.domain.usecase

import com.yong.newslist.domain.model.Article
import com.yong.newslist.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetArticlesUseCase @Inject constructor(
    private val newsRepository: NewsRepository
) {
    operator fun invoke(searchWord: String): Result<Flow<List<Article>>> {
        return runCatching {
            newsRepository.getArticles(searchWord)
        }.onSuccess { newsResult ->
            Result.success(newsResult)
        }.onFailure {
            Result.failure<List<Article>>(it)
        }
    }
}