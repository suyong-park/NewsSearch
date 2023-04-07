package com.yong.newslist.articles.ui

import androidx.lifecycle.ViewModel
import com.yong.newslist.domain.usecase.GetArticlesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ArticlesViewModel @Inject constructor(
    private val getArticlesUseCase: GetArticlesUseCase
) : ViewModel() {

    val articles = getArticlesUseCase(searchWord = "google")
        .onSuccess {

        }.onFailure {

        }

    init {
        getNewsList()
    }

    private fun getNewsList() {

    }

    fun onClickNewsItem(id: Long) {

    }

    fun addBookmark(id: Long) {

    }
}