package com.yong.newslist.news_detail.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.yong.newslist.news_detail.ui.NewsDetailRoute

const val NEWS_DETAIL_ROUTE = "news_detail_route"

fun NavGraphBuilder.startNewsDetailScreen() {
    composable(NEWS_DETAIL_ROUTE) { NewsDetailRoute() }
}