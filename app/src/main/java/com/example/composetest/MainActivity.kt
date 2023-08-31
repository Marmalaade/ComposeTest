package com.example.composetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainBox()
        }
    }
}

@Composable
fun MainBox() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.1f)
            .padding(16.dp),
        backgroundColor = Color.LightGray,
        shape = RoundedCornerShape(10.dp),
        elevation = 6.dp
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.search),
                contentDescription = "search_image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(24.dp)
                    .align(Alignment.CenterVertically)
                    .offset(8.dp)

            )
            Text(
                text = "Должность, вакансия, ключевые слова...",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(start = 8.dp)
                    .offset(16.dp)
            )
        }
    }
}



