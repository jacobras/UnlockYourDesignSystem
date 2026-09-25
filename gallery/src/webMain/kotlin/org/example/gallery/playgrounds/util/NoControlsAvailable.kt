package org.example.gallery.playgrounds.util

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun NoControlsAvailable() {
    Text(
        text = "There are no controls available for this component.",
        style = MaterialTheme.typography.bodyMedium.copy(
            color = MaterialTheme.colorScheme.outline
        )
    )
}