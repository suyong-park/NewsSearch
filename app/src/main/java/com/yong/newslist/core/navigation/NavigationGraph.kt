package com.yong.newslist.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.yong.newslist.clip.navigation.startClipScreen
import com.yong.newslist.articles.navigation.ARTICLE_ROUTE
import com.yong.newslist.articles.navigation.startArticlesScreen
import com.yong.newslist.article_detail.navigation.startNewsDetailScreen

@Composable
fun NewsListNavHost(navigationController: NavHostController) {
    NavHost(
        navController = navigationController,
        startDestination = ARTICLE_ROUTE
    ) {
        startArticlesScreen()
        startClipScreen()
        startNewsDetailScreen()
    }
}