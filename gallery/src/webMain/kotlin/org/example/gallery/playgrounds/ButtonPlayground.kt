package org.example.gallery.playgrounds

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Switch
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.util.design.components.SpecialButton
import org.example.gallery.playgrounds.util.Playground
import org.example.gallery.playgrounds.util.provideGalleryFontSize

@Composable
fun ButtonPlayground() {
    val state = remember { ButtonPlaygroundState() }

    Playground(
        component = {
            provideGalleryFontSize {
                SpecialButton(
                    label = state.label,
                    enabled = state.enabled,
                    onClick = {}
                )
            }
        },
        controls = { ButtonPlaygroundControls(state) }
    )
}

@Composable
private fun ButtonPlaygroundControls(state: ButtonPlaygroundState) {
    Column {
        TextField(
            value = state.label,
            onValueChange = { state.label = it }
        )
        Switch(
            checked = state.enabled,
            onCheckedChange = { state.enabled = it }
        )
    }
}

private class ButtonPlaygroundState {
    var label by mutableStateOf("Hello")
    var enabled by mutableStateOf(true)
}