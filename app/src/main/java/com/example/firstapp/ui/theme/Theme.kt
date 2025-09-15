package com.example.firstapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    primary = BrandBlue,
    onPrimary = ColorWhite,
    background = BrandLight,
    onBackground = TextColor,
)

private val DarkColors = darkColorScheme(
    primary = BrandBlue,
)

@Composable
fun FirstAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColors else LightColors
    MaterialTheme(
        colorScheme = colors,
        typography = androidx.compose.material3.Typography(),
        content = content
    )
}

// simple color alias
private val ColorWhite = androidx.compose.ui.graphics.Color(0xFFFFFFFF)
