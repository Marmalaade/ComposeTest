package com.example.composetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
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
                    Column {
                        TopText()
                        TwoBoxRow()
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
    val textState = remember { mutableStateOf("") }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically

    ) {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .width(305.dp)
                .height(30.dp)
                .background(AppTheme.colors.cardBackground)
                .padding(4.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            Row(
                modifier = Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                TextFieldWithIcon()
            }
        }

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
fun TextFieldWithIcon() {
    val textState = remember { mutableStateOf(("")) }
    return OutlinedTextField(
        value = textState.value,
        leadingIcon = {
            Icon(
                painter = painterResource(id = R.drawable.searchicon),
                contentDescription = "searchIcon"
            )
        },
        onValueChange = {
            textState.value = it
        },
        placeholder = { Text(text = stringResource(id = R.string.text_field)) },
    )
}










