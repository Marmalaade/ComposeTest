package com.example.composetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
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
                    Column {
                        TopText()
                        TwoBoxRow()
                        MainGrid()
                    }

                }
            }
        }
    }
}


@Preview
@Composable
fun TopText() {
    Text(
        text = stringResource(R.string.tittle_text),
        fontFamily = lato,
        modifier = Modifier
            .fillMaxWidth(1f)
            .padding(top = 16.dp, start = 22.dp, end = 16.dp),
        color = AppTheme.colors.tittleColor,
        textAlign = TextAlign.Start,
        fontSize = 15.sp,
        fontWeight = FontWeight.Bold,
    )

}

@Composable
fun TwoBoxRow() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically

    ) {

        SearchTextField()
        Spacer(modifier = Modifier.width(8.dp))

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .width(30.dp)
                .height(30.dp)
                .background(AppTheme.colors.cardBackground)

        ) {
            Icon(
                painter = painterResource(id = R.drawable.optionsicon), contentDescription = "optionsIcon", modifier = Modifier.align(
                    Center
                )
            )
        }
    }
}

@Composable
fun MainGrid() {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(163.dp),
        contentPadding = PaddingValues(
            start = 16.dp,
            end = 16.dp,
            top = 16.dp,
            bottom = 16.dp
        ),
        content = {
            items(8) { i ->
                Card(
                    modifier = Modifier
                        .width(163.dp)
                        .height(163.dp)
                        .padding(8.dp),
                    backgroundColor = AppTheme.colors.cardBackground,
                    elevation = 8.dp,
                    shape = RoundedCornerShape(16.dp)
                ) {
                    Text(text = "Card $i")
                }
            }
        }
    )
}

@Composable
fun SearchTextField() {
    val textState = remember {
        mutableStateOf("")
    }
    TextField(
        modifier = Modifier
            .height(30.dp)
            .width(305.dp)
            .background(AppTheme.colors.cardBackground, shape = RoundedCornerShape(8.dp)),
        value = textState.value,
        onValueChange = {
            textState.value = it
        },
        textStyle = TextStyle(color = AppTheme.colors.mainTextColor, fontSize = 10.sp),
        leadingIcon = {
            Icon(
                painter = painterResource(id = R.drawable.searchicon),
                contentDescription = "search icon",
                tint = AppTheme.colors.mainTextColor
            )
        }
    )
}










