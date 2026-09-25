package org.example.gallery.playgrounds.util.controls

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState

@Composable
fun LabelControl(
    name: String,
    state: MutableState<String>
) {
    TextField(
        value = state.value,
        onValueChange = { state.value = it },
        label = { Text(name) }
    )
}