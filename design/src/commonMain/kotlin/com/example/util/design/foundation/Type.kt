package com.example.util.design.foundation

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.FontFamily

private val default = Typography()

internal val Typography = Typography(
    displayLarge = default.displayLarge.copy(fontFamily = FontFamily.Monospace),
    displayMedium = default.displayMedium.copy(fontFamily = FontFamily.Monospace),
    displaySmall = default.displaySmall.copy(fontFamily = FontFamily.Monospace),
    headlineLarge = default.headlineLarge.copy(fontFamily = FontFamily.Monospace),
    headlineMedium = default.headlineMedium.copy(fontFamily = FontFamily.Monospace),
    headlineSmall = default.headlineSmall.copy(fontFamily = FontFamily.Monospace),
    titleLarge = default.titleLarge.copy(fontFamily = FontFamily.Monospace),
    titleMedium = default.titleMedium.copy(fontFamily = FontFamily.Monospace),
    titleSmall = default.titleSmall.copy(fontFamily = FontFamily.Monospace),
    bodyLarge = default.bodyLarge.copy(fontFamily = FontFamily.Monospace),
    bodyMedium = default.bodyMedium.copy(fontFamily = FontFamily.Monospace),
    bodySmall = default.bodySmall.copy(fontFamily = FontFamily.Monospace),
    labelLarge = default.labelLarge.copy(fontFamily = FontFamily.Monospace),
    labelMedium = default.labelMedium.copy(fontFamily = FontFamily.Monospace),
    labelSmall = default.labelSmall.copy(fontFamily = FontFamily.Monospace),
)