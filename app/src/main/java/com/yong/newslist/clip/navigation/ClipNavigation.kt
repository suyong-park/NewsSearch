package com.yong.newslist.clip.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.yong.newslist.clip.ui.ClipRoute

const val CLIP_ROUTE = "clip_route"

fun NavGraphBuilder.startClipScreen() {
    composable(CLIP_ROUTE) { ClipRoute() }
}