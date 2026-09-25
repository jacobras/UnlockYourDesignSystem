package org.example.gallery.playgrounds

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.example.util.design.components.SpecialButton
import org.example.gallery.playgrounds.util.Playground
import org.example.gallery.playgrounds.util.controls.LabelControl
import org.example.gallery.playgrounds.util.controls.SwitchControl
import org.example.gallery.playgrounds.util.provideGalleryFontSize

@Composable
fun ButtonPlayground() {
    val state = remember { ButtonPlaygroundState() }

    Playground(
        component = {
            provideGalleryFontSize {
                SpecialButton(
                    label = state.label.value,
                    enabled = state.enabled.value,
                    onClick = {}
                )
            }
        },
        controls = { ButtonPlaygroundControls(state) }
    )
}

@Composable
private fun ButtonPlaygroundControls(state: ButtonPlaygroundState) {
    LabelControl(
        name = "Label",
        state = state.label
    )
    SwitchControl(
        name = "Enabled",
        state = state.enabled
    )
}

private class ButtonPlaygroundState {
    var label = mutableStateOf("Hello")
    var enabled = mutableStateOf(true)
}