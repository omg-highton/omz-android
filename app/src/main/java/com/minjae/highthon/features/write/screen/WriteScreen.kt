package com.minjae.highthon.features.write.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.minjae.highthon.R
import com.minjae.highthon.core.component.BasicButton
import com.minjae.highthon.core.component.OmzTextField
import com.minjae.highthon.core.theme.Headline1
import com.minjae.highthon.core.theme.Headline2
import com.minjae.highthon.core.theme.OmzColor
import com.minjae.highthon.core.theme.Tag1
import team.duckie.quackquack.ui.component.QuackBasicTextArea

@Composable
fun WriteScreen() {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)) {
        WriteHeader()
        Divider(color = OmzColor.Gray20, thickness = 1.dp)

        Column(modifier = Modifier.padding(20.dp)) {
            Spacer(modifier = Modifier.height(20.dp))

            var title by remember { mutableStateOf("") }

            QuackBasicTextArea(
                text = title,
                placeholderText = "제목을 입력하세요...",
                onTextChanged = { title = it },
            )

            Row {
                Tag1(text = "민재재 . ", color = OmzColor.Gray80)
                Tag1(text = "M세대", color = OmzColor.DarkYellow)
            }
            Spacer(modifier = Modifier.height(6.dp))
            Tag1(text = "2023.01.15", color = OmzColor.Gray80)

            Spacer(modifier = Modifier.height(20.dp))
            Divider(color = OmzColor.Gray20, thickness = 1.dp)

            Spacer(modifier = Modifier.height(20.dp))

            Column {
                QuackBasicTextArea(
                    text = title,
                    onTextChanged = { title = it },
                    placeholderText = "글을 작성하세요...",
                    modifier = Modifier.fillMaxWidth().weight(1f)
                )
                BasicButton(
                    onClick = {},
                    backgroundColor = OmzColor.Gray40,
                    pressedBackgroundColor = OmzColor.Gray40,
                    disabledBackgroundColor = OmzColor.Gray40,
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .height(48.dp)
                        .fillMaxWidth()
                ) {
                    Headline2(
                        text = "등록하기",
                        color = OmzColor.White,
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )
                }
            }

        }

    }
}

@Composable
private fun WriteHeader() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White)
            .height(60.dp)
    ) {
        Row(modifier = Modifier.fillMaxSize()) {
            Spacer(modifier = Modifier.width(20.dp))
            Image(
                painter = painterResource(id = R.drawable.ic_back),
                modifier = Modifier.align(Alignment.CenterVertically),
                contentDescription = null
            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)
            ) {
                Headline1(
                    text = "게시글 작성하기",
                    color = Color.Black,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
            }
        }
    }
}

@Preview
@Composable
fun WriteHeaderPreview() {
    WriteHeader()
}

@Preview(showBackground = true)
@Composable
fun WriteScreenPreview() {
    WriteScreen()
}