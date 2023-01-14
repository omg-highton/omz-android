package com.minjae.highthon.features.result.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.minjae.highthon.core.theme.OmzColor

@Composable
fun ResultScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(OmzColor.Check)
    ) {
        Text(text = "결과")
    }
}