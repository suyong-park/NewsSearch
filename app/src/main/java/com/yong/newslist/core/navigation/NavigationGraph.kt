package com.yong.newslist.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.yong.newslist.clip.navigation.startClipScreen
import com.yong.newslist.news.navigation.NEWS_ROUTE
import com.yong.newslist.news.navigation.startNewsScreen
import com.yong.newslist.news_detail.navigation.startNewsDetailScreen

@Composable
fun NewsListNavHost(navigationController: NavHostController) {
    NavHost(
        navController = navigationController,
        startDestination = NEWS_ROUTE
    ) {
        startNewsScreen()
        startClipScreen()
        startNewsDetailScreen()
    }
}