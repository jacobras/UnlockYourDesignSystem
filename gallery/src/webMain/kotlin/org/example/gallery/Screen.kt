package org.example.gallery

import androidx.compose.runtime.Composable
import org.example.gallery.playgrounds.ButtonPlayground
import org.example.gallery.playgrounds.CardPlayground
import org.example.gallery.playgrounds.SpinnerPlayground

internal enum class Screen(
    val title: String,
    val content: @Composable () -> Unit
) {
    Button(
        title = "Button",
        content = { ButtonPlayground() }
    ),
    Card(
        title = "Card",
        content = { CardPlayground() }
    ),
    Spinner(
        title = "Spinner",
        content = { SpinnerPlayground() }
    )
}