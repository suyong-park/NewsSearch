package com.yong.newslist.articles.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.yong.newslist.R
import com.yong.newslist.core.ui.designsystem.NewsText
import com.yong.newslist.core.ui.state.ArticleUiState
import com.yong.newslist.domain.model.Article

@Composable
fun ArticlesRoute(
    viewModel: ArticlesViewModel = hiltViewModel()
) {
    val articles = viewModel.articles.collectAsState()
    ArticlesScreen(
        articlesUiState = articles.value,
        onClickNewsItem = viewModel::onClickNewsItem,
        addBookmark = viewModel::addBookmark
    )
}

@Composable
private fun ArticlesScreen(
    articlesUiState: ArticleUiState,
    onClickNewsItem: (id: Long) -> Unit,
    addBookmark: (id: Long) -> Unit
) {
    when (articlesUiState) {
        is ArticleUiState.Loading -> {

        }
        is ArticleUiState.Success -> {
            LazyColumn {
                items(articlesUiState.articles) {
                    Article(it)
                }
            }
        }
        else -> EmptyArticleScreen()
    }
}

@Composable
private fun LoadingArticleScreen() {

}

@Composable
private fun Article(
    article: Article
) {
    Text(
        text = article.title,
        color = Color.White
    )
}

@Composable
private fun EmptyArticleScreen() {
    NewsText(
        text = stringResource(id = R.string.article_empty_search_result),
        modifier = Modifier.padding(10.dp)
    )
}