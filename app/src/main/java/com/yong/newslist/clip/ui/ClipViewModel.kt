package com.yong.newslist.clip.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yong.newslist.data.repository.NewsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ClipViewModel @Inject constructor(
    private val newsRepository: NewsRepository
) : ViewModel() {

    init {
        getSavedNewsList()
    }

    private fun getSavedNewsList() {
        viewModelScope.launch {
            newsRepository.getSavedNewsList()
        }
    }

    fun onClickNewsItem(id: Long) {

    }

    fun removeBookmark(id: Long) {

    }
}