package org.example.gallery

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import com.example.util.design.components.SpecialButton
import com.example.util.design.foundation.SpecialTheme

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    ComposeViewport {
        SpecialTheme {
            SpecialButton(
                label = "Hello, World!",
                onClick = {}
            )
        }
    }
}