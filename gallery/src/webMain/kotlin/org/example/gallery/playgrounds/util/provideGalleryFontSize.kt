package org.example.gallery.playgrounds.util

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Density
import org.example.gallery.GalleryState

@Composable
fun provideGalleryFontSize(content: @Composable () -> Unit) {
    CompositionLocalProvider(
        value = LocalDensity provides Density(
            density = LocalDensity.current.density,
            fontScale = GalleryState.fontScale.scale
        ),
        content = content
    )
}