package com.lordpacific.calorify.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import com.lordpacific.core_ui.BrightOrange
import com.lordpacific.core_ui.DarkGray
import com.lordpacific.core_ui.DarkOrange
import com.lordpacific.core_ui.Dimensions
import com.lordpacific.core_ui.LightGray
import com.lordpacific.core_ui.LocalSpacing
import com.lordpacific.core_ui.MediumGray
import com.lordpacific.core_ui.Orange
import com.lordpacific.core_ui.TextWhite

private val DarkColorPalette = darkColors(
    primary = BrightOrange,
    primaryVariant = DarkOrange,
    secondary = Orange,
    background = MediumGray,
    onBackground = TextWhite,
    surface = LightGray,
    onSurface = TextWhite,
    onPrimary = Color.White,
    onSecondary = Color.White,
)

private val LightColorPalette = lightColors(
    primary = BrightOrange,
    primaryVariant = DarkOrange,
    secondary = Orange,
    background = Color.White,
    onBackground = DarkGray,
    surface = Color.White,
    onSurface = DarkGray,
    onPrimary = Color.White,
    onSecondary = Color.White,
)

@Composable
fun CalorifyTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }
    CompositionLocalProvider(LocalSpacing provides Dimensions()) {
        MaterialTheme(
            colors = colors,
            typography = Typography,
            shapes = Shapes,
            content = content
        )
    }
}