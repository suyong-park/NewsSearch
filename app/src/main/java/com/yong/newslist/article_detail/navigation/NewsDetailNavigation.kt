package com.yong.newslist.article_detail.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.yong.newslist.article_detail.ui.NewsDetailRoute

const val ARTICLE_DETAIL_ROUTE = "article_detail_route"

fun NavGraphBuilder.startNewsDetailScreen() {
    composable(ARTICLE_DETAIL_ROUTE) { NewsDetailRoute() }
}