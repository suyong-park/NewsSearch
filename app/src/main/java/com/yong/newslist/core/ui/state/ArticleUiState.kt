package com.yong.newslist.core.ui.state

import com.yong.newslist.domain.model.Article

sealed interface ArticleUiState {
    object Loading : ArticleUiState
    data class Success(val articles: List<Article>) : ArticleUiState
    data class Fail<T>(val exception: Throwable) : ArticleUiState
}