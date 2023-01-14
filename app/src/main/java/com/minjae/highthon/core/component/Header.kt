package com.minjae.highthon.core.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.minjae.highthon.R
import com.minjae.highthon.core.icon.OmzIcon
import com.minjae.highthon.core.theme.Headline1
import com.minjae.highthon.core.theme.OmzColor
import com.minjae.highthon.core.theme.Option

@Composable
fun Header(
    modifier: Modifier = Modifier,
    headerText: String,
    enabledBackBtn: Boolean = false,
    enabledChatBtn: Boolean = false,
    enabledEditBtn: Boolean = false,
    enabledNoticeBtn: Boolean = false,
    textBtn: String? = null,
    onNotice: (() -> Unit)? = null,
    onTextBtn: (() -> Unit)? = null,
    onPrevious: (() -> Unit)? = null,
    onMessage: (() -> Unit)? = null,
    onEdit: (() -> Unit)? = null
) {
    Column {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .height(38.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            if (enabledBackBtn) {
                IconButton(onClick = onPrevious ?: {}, modifier = Modifier.size(21.dp)) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_back_small),
                        contentDescription = null
                    )
                }
            }

            Spacer(modifier = Modifier.width(12.dp))

            Headline1(text = headerText)

            Spacer(modifier = Modifier.weight(1f))

//            if (enabledNoticeBtn) {
//                Spacer(modifier = Modifier.width(8.dp))
//
//                IconButton(onClick = onNotice ?: {}, modifier = Modifier.size(24.dp)) {
//                    Image(
//                        painter = painterResource(id = OmzIcon.Notice),
//                        contentDescription = null
//                    )
//                }
//            }
//
//            if (enabledChatBtn) {
//                Spacer(modifier = Modifier.width(8.dp))
//
//                IconButton(onClick = onMessage ?: {}, modifier = Modifier.size(24.dp)) {
//                    Image(
//                        painter = painterResource(id = OmzIcon.Message),
//                        contentDescription = null
//                    )
//                }
//            }
//
//            if (enabledEditBtn) {
//                Spacer(modifier = Modifier.width(8.dp))
//
//                IconButton(onClick = onEdit ?: {}, modifier = Modifier.size(24.dp)) {
//                    Image(
//                        painter = painterResource(id = OmzIcon.Edit),
//                        contentDescription = null
//                    )
//                }
//            }

            if (textBtn != null) {
                Option(
                    text = textBtn,
                    color = OmzColor.MainColor,
                    modifier = Modifier.clickable {
                        if (onTextBtn != null) {
                            onTextBtn()
                        }
                    }
                )
            }
        }

        Divider(
            thickness = 0.5.dp,
            color = OmzColor.Gray100,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview
@Composable
fun PreviewHeader() {
    Column {
        Header(headerText = "전체 지점", enabledChatBtn = true)
    }
}
