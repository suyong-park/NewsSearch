package com.yong.newslist.news.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.yong.newslist.news.ui.NewsRoute

const val NEWS_ROUTE = "news_route"

fun NavGraphBuilder.startNewsScreen() {
    composable(NEWS_ROUTE) { NewsRoute() }
}