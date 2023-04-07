package com.yong.newslist.clip.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yong.newslist.domain.usecase.GetArticlesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ClipViewModel @Inject constructor(
    private val articlesUseCase: GetArticlesUseCase
) : ViewModel() {

    init {
        getSavedNewsList()
    }

    private fun getSavedNewsList() {
        viewModelScope.launch {

        }
    }

    fun onClickNewsItem(id: Long) {

    }

    fun removeBookmark(id: Long) {

    }
}