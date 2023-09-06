package com.example.composetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetest.ui.theme.AppTheme
import com.example.composetest.ui.theme.ComposeTestTheme
import com.example.composetest.ui.theme.lato

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize(),
                    color = AppTheme.colors.primaryBackground
                ) {
                    TopItems()
                }
            }
        }
    }
}


@Preview
@Composable
fun TopItems() {
    Text(
        text = stringResource(R.string.tittle_text),
        modifier = Modifier
            .fillMaxWidth(1f)
            .padding(top = 16.dp, start = 22.dp, end = 16.dp),
        color = AppTheme.colors.tittleColor,
        textAlign = TextAlign.Start,
        fontFamily = lato,
        fontSize = 15.sp,
        fontWeight = FontWeight.Bold,

        )


}





