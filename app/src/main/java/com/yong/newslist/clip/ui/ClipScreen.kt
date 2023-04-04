package com.yong.newslist.clip.ui

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun ClipRoute() {
    ClipScreen()
}

@Composable
fun ClipScreen(
    clipViewModel: ClipViewModel = hiltViewModel()
) {
    Text(text = "클립 화면입니다.")
}