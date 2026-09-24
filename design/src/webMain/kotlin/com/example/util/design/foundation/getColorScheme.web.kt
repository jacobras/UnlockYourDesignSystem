package com.example.util.design.foundation

@androidx.compose.runtime.Composable
actual fun getColorScheme(darkTheme: Boolean): androidx.compose.material3.ColorScheme {
    return if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }
}