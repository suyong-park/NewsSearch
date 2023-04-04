package com.yong.newslist.news.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yong.newslist.data.repository.NewsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(
    private val newsRepository: NewsRepository
) : ViewModel() {

    private val

    init {
        getNewsList()
    }

    private fun getNewsList() {
        Log.e("NewsViewModel", "getNewsList")
        viewModelScope.launch {
            newsRepository.getNewsList("google")
        }
    }

    fun onClickNewsItem(id: Long) {

    }

    fun addBookmark(id: Long) {

    }
}