package com.yong.newslist.clip.ui

import com.yong.newslist.common.base.BaseViewModel
import com.yong.newslist.domain.usecase.GetArticlesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ClipViewModel @Inject constructor(
    articlesUseCase: GetArticlesUseCase
) : BaseViewModel() {

    fun onClickNewsItem(id: Long) {

    }

    fun removeBookmark(id: Long) {

    }
}