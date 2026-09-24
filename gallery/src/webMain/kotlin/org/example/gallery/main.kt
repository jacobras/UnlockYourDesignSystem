package org.example.gallery

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import com.example.util.design.foundation.SpecialTheme
import org.example.gallery.playgrounds.CardPlayground

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    ComposeViewport {
        SpecialTheme {
            CardPlayground()
        }
    }
}