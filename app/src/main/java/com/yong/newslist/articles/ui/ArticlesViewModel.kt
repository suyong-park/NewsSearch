package com.yong.newslist.articles.ui

import androidx.lifecycle.viewModelScope
import com.yong.newslist.common.base.BaseViewModel
import com.yong.newslist.core.ui.state.ArticleUiState
import com.yong.newslist.domain.model.Article
import com.yong.newslist.domain.usecase.GetArticlesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import javax.inject.Inject

@HiltViewModel
class ArticlesViewModel @Inject constructor(
    getArticlesUseCase: GetArticlesUseCase
) : BaseViewModel() {

    val articles: StateFlow<ArticleUiState> = getArticlesUseCase(searchWord = "google")
        .onFailure { it.toNewsException() }
        .getOrDefault(flowOf(listOf()))
        .filter { it.isNotEmpty() }
        .map<List<Article>, ArticleUiState>(ArticleUiState::Success)
        .onStart { emit(ArticleUiState.Loading) }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(2000),
            initialValue = ArticleUiState.Loading
        )

    fun onClickNewsItem(id: Long) {

    }

    fun addBookmark(id: Long) {

    }
}