package com.yong.newslist.news.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.compose.runtime.Composable
import com.yong.newslist.domain.model.News

@Composable
fun NewsRoute(
    viewModel: NewsViewModel = hiltViewModel()
) {
    NewsScreen(
        onClickNewsItem = viewModel::onClickNewsItem,
        addBookmark = viewModel::addBookmark
    )
}

@Composable
fun NewsScreen(
    onClickNewsItem: (id: Long) -> Unit,
    addBookmark: (id: Long) -> Unit
) {
    LazyColumn {
        
    }
}