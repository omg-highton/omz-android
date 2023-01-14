package com.minjae.highthon.features.home.screen

import android.nfc.Tag
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.minjae.highthon.R
import com.minjae.highthon.core.component.Banner
import com.minjae.highthon.core.modifier.omzClickable
import com.minjae.highthon.core.theme.Headline1
import com.minjae.highthon.core.theme.Headline2
import com.minjae.highthon.core.theme.OmzColor
import com.minjae.highthon.core.theme.Option
import com.minjae.highthon.core.theme.Tag1
import com.minjae.highthon.core.theme.Tag2

private val feed: List<FeedItem> = (1..10).map {
    FeedItem(
        number = 1,
        title = "게시글 $1",
        writer = Writer(
            name ="user",
            type = MZType.M,
            rank = Rank.Bronze,
        ),
        commentNum = 10,
        seeNum = 10,
        goodNum = 10,
    )
}.toList()

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

        items(feed) { item ->
            Divider(color = OmzColor.DIVIDER)
            HomeFeedLayout(
                feed = item,
                onClicked = {},
            )
        }
    }
}

enum class MZType(
    val text: String,
) {
    M("M세대"),
    Z("Z세대"),
}

enum class Rank {
    Iron,
    Bronze,
    Silver,
    Gold,
    Platinum,
    Diamond,
    Master,
}
data class Writer(
    val name: String,
    val type: MZType,
    val rank: Rank,
)

data class FeedItem(
    val number: Int,
    val title: String,
    val writer: Writer,
    val commentNum: Int,
    val seeNum: Int,
    val goodNum: Int,
)
@Composable
private fun HomeFeedLayout(
    feed: FeedItem,
    onClicked: (Int) -> Unit,
) {
    Row(
        modifier = Modifier
            .omzClickable {
                onClicked(feed.number)
            }
            .fillMaxWidth()
            .padding(
                horizontal = 20.dp,
                vertical = 16.dp,
            )
    ) {
        Box(
            modifier = Modifier.fillMaxHeight(),
            contentAlignment = Alignment.TopCenter,
        ) {
            Option(text = "${feed.number}")
        }

        Spacer(modifier = Modifier.width(12.dp))

        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Headline2(text = feed.title)

            Spacer(modifier = Modifier.height(4.dp))

            Row {
                Tag1(text = feed.writer.name + " · ")

                Tag1(
                    text = feed.writer.type.text,
                    color = OmzColor.DarkOrange,
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                horizontalArrangement = Arrangement.spacedBy(5.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                HomeIconText(
                    painter = painterResource(id = R.drawable.ic_comment),
                    text = feed.commentNum.toString(),
                )
                HomeIconText(
                    painter = painterResource(id = R.drawable.ic_see),
                    text = feed.seeNum.toString(),
                )
                HomeIconText(
                    painter = painterResource(id = R.drawable.ic_good),
                    text = feed.goodNum.toString(),
                )
            }
        }
    }
}

@Composable
fun HomeIconText(
    painter: Painter,
    text: String,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            modifier = Modifier
                .size(12.dp),
            painter = painter,
            contentDescription = null,
        )

        Spacer(modifier = Modifier.width(2.dp))

        Tag2(
            text = text,
            color = OmzColor.Gray40,
        )
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