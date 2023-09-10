package com.example.composetest

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.composetest.ui.theme.AppTheme

@Composable
fun Test() {
    val textState = remember {
        mutableStateOf("")
    }

    Surface(
        shape = MaterialTheme.shapes.medium,
        elevation = 8.dp,
        modifier = Modifier.fillMaxSize(1f),
        color = AppTheme.colors.cardBackground
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(8.dp)
        ) {
            Text(
                text = textState.value,
                modifier = Modifier
                    .padding(16.dp)
                    .align(CenterHorizontally),
                style = MaterialTheme.typography.h2,
                textAlign = TextAlign.Center,
                maxLines = 1,
            )
            Button(onClick = { textState.value = getRandom().random() }, modifier = Modifier.align(CenterHorizontally)) {
                Text(text = "Click me")
            }

        }

    }
}

fun getRandom() = listOf<String>("First", "Second", "Third")