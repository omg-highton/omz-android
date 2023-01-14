package com.minjae.highthon.features.home.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.minjae.highthon.R
import com.minjae.highthon.core.component.Banner
import com.minjae.highthon.core.theme.Body1
import com.minjae.highthon.core.theme.OmzColor
import com.minjae.highthon.features.home.vm.HomeVM

@Composable
fun HomeScreen(
//    homeVM: HomeVM,
//    navController: NavController
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(OmzColor.BackgroundColor)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            TopLogo()
            Banner(image = painterResource(id = R.drawable.dummy_img))
            Box(
                modifier = Modifier
                    .height(44.dp)
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
            ) {
                Body1(
                    text = "인기 게시물",
                    modifier = Modifier.align(Alignment.CenterStart)
                )
            }
            Divider(color = OmzColor.DIVIDER)
        }
    }
}

@Composable
private fun TopLogo() {
    Box(modifier = Modifier
        .background(color = OmzColor.MainColor)
    ) {
        Image(
            painter = painterResource(id = R.drawable.omz_header),
            contentDescription = null,
            modifier = Modifier
                .height(56.dp)
                .fillMaxWidth()
        )
    }
}

@Preview
@Composable
fun TopLogoPreview() {
    TopLogo()
}

@Preview
@Composable
fun HomePreview() {
    HomeScreen()
}