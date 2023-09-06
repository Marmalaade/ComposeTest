package com.example.composetest.ui.theme

import androidx.compose.ui.graphics.Color

data class Colors(
    val primaryBackground: Color,
    val cardBackground: Color,
    val mainTextColor: Color,
    val iconColor: Color,
    val blueColor: Color,
    val greenColor: Color,
    val purpleColor: Color,
    val skyBlueColor: Color,
    val yellowColor: Color,
    val pinkColor: Color,
    val darkRedColor: Color,
    val orangeColor: Color

)

val colorPalette = Colors(
    primaryBackground = Color(0xFF333333),
    cardBackground = Color(0xFFD9D9D9),
    mainTextColor = Color(0xFF1E1E1E),
    iconColor = Color(0xFF000000),
    blueColor = Color(0xFF0074D9),
    greenColor = Color(0xFF2ECC40),
    purpleColor = Color(0xFFB10DC9),
    skyBlueColor = Color(0xFF7FDBFF),
    yellowColor = Color(0xFFFFDC00),
    pinkColor = Color(0xFFFFC0CB),
    darkRedColor = Color(0xFF800000),
    orangeColor = Color(0xFFFF851B)
)
