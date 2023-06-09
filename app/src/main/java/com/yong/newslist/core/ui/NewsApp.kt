package com.yong.newslist.core.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.yong.newslist.R
import com.yong.newslist.clip.navigation.CLIP_ROUTE
import com.yong.newslist.core.navigation.NewsListNavHost
import com.yong.newslist.articles.navigation.ARTICLE_ROUTE

@Composable
fun NewsApp(navigationController: NavHostController = rememberNavController()) {
    Scaffold(
        bottomBar = { NewsBottomNavigationView(navigationController = navigationController) }
    ) {
        Box(modifier = Modifier.padding(it)) {
            NewsListNavHost(navigationController = navigationController)
        }
    }
}

@Composable
fun NewsBottomNavigationView(navigationController: NavHostController) {
    val bottomTabItems = listOf(
        BottomTabItem.Article,
        BottomTabItem.Clip
    )

    BottomNavigation(
        backgroundColor = Color.White
    ) {
        bottomTabItems.forEach { tab ->
            BottomNavigationItem(
                selected = tab == BottomTabItem.Article,
                onClick = {
                    navigationController.navigate(tab.route)
                },
                icon = {
                    Icon(
                        painter = painterResource(id = tab.iconResId),
                        contentDescription = stringResource(id = tab.titleResId),
                        tint = Color.Unspecified
                    )
                },
                selectedContentColor = Color.Gray,
                unselectedContentColor = Color.Black
            )
        }
    }
}

sealed class BottomTabItem(
    val titleResId: Int,
    val iconResId: Int,
    val route: String
) {
    object Article : BottomTabItem(R.string.article_list, R.drawable.new_list_foreground, ARTICLE_ROUTE)
    object Clip : BottomTabItem(R.string.clip_list, R.drawable.bookmark_list_foreground, CLIP_ROUTE)
}