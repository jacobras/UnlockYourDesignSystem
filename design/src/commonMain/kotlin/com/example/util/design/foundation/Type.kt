package com.example.util.design.foundation

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import org.jetbrains.compose.resources.Font
import unlockyourdesignsystem.design.generated.resources.Res
import unlockyourdesignsystem.design.generated.resources.jetbrains_mono_bold
import unlockyourdesignsystem.design.generated.resources.jetbrains_mono_regular

@Composable
internal fun specialTypography(): Typography {
    val mono = FontFamily(
        Font(Res.font.jetbrains_mono_regular, FontWeight.Normal),
        Font(Res.font.jetbrains_mono_bold, FontWeight.Bold)
    )

    return Typography(
        displayLarge = default.displayLarge.copy(fontFamily = mono),
        displayMedium = default.displayMedium.copy(fontFamily = mono),
        displaySmall = default.displaySmall.copy(fontFamily = mono),
        headlineLarge = default.headlineLarge.copy(fontFamily = mono),
        headlineMedium = default.headlineMedium.copy(fontFamily = mono),
        headlineSmall = default.headlineSmall.copy(fontFamily = mono),
        titleLarge = default.titleLarge.copy(fontFamily = mono),
        titleMedium = default.titleMedium.copy(fontFamily = mono),
        titleSmall = default.titleSmall.copy(fontFamily = mono),
        bodyLarge = default.bodyLarge.copy(fontFamily = mono),
        bodyMedium = default.bodyMedium.copy(fontFamily = mono),
        bodySmall = default.bodySmall.copy(fontFamily = mono),
        labelLarge = default.labelLarge.copy(fontFamily = mono),
        labelMedium = default.labelMedium.copy(fontFamily = mono),
        labelSmall = default.labelSmall.copy(fontFamily = mono),
    )
}

private val default = Typography()