package com.example.composetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.composetest.utils.ImageData

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //LoadData()
            LoadImage(path = ImageData.IMAGE_URL)
        }
    }
}


//@Composable
//fun LoadData() {
//    Box(
//        modifier = Modifier
//            .fillMaxSize(1f),
//        contentAlignment = Alignment.Center
//
//    ) {
//        val isLoading = remember {
//            mutableStateOf(false)
//        }
//        Button(
//            onClick = {
//                isLoading.value = !isLoading.value
//            }, colors = ButtonDefaults.buttonColors(
//                backgroundColor = Color.Magenta,
//                contentColor = Color.Green
//            )
//        ) {
//            if (!isLoading.value) {
//                Text(text = "Data loading")
//            } else {
//                CircularProgressIndicator(
//                    color = Color.White, modifier = Modifier
//                        .height(15.dp)
//                        .width(20.dp)
//                )
//            }
//        }
//
//    }
//}

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun LoadImage(path: String) {
    Box(
        modifier = Modifier
            .fillMaxSize(1f)
            .padding(16.dp), contentAlignment = Alignment.Center
    ) {
        GlideImage(
            model = path, contentDescription = "Loading Data",
            modifier = Modifier.fillMaxSize(0.3f)
        ) {
            it.error(R.drawable.ic_launcher_background)
                .placeholder(R.drawable.ic_launcher_foreground)
                .load(path)
        }
    }
}





