package com.yong.newslist.articles.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.compose.runtime.Composable

@Composable
fun ArticlesRoute(
    viewModel: ArticlesViewModel = hiltViewModel()
) {
    ArticlesScreen(
        onClickNewsItem = viewModel::onClickNewsItem,
        addBookmark = viewModel::addBookmark
    )
}

@Composable
fun ArticlesScreen(
    onClickNewsItem: (id: Long) -> Unit,
    addBookmark: (id: Long) -> Unit
) {
    LazyColumn {
        
    }
}