package com.minjae.highthon.features.home.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.minjae.highthon.R
import com.minjae.highthon.core.component.Banner
import com.minjae.highthon.core.theme.Headline1
import com.minjae.highthon.core.theme.OmzColor

@Composable
fun HomeScreen(
//    homeVM: HomeVM,
//    navController: NavController
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(OmzColor.BackgroundColor)
    ) {
        item {
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
                    Headline1(
                        text = "인기 게시물",
                        modifier = Modifier.align(Alignment.CenterStart)
                    )
                }
                Divider(color = OmzColor.DIVIDER)
            }
        }

        itemsIndexed()
    }
}

@Composable
private fun HomeFeedLayout() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(88.dp)
            .padding(
                horizontal = 20.dp,
                vertical = 16.dp,
            )
    ) {

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