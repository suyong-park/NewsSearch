package com.yong.newslist.articles.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.yong.newslist.articles.ui.ArticlesRoute

const val ARTICLE_ROUTE = "articles_route"

fun NavGraphBuilder.startArticlesScreen() {
    composable(ARTICLE_ROUTE) { ArticlesRoute() }
}