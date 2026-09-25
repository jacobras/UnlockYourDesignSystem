package org.example.gallery.playgrounds

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.util.design.components.SpecialSpinner
import org.example.gallery.playgrounds.util.provideGalleryFontSize

@Composable
fun SpinnerPlayground() {
    provideGalleryFontSize {
        SpecialSpinner(Modifier.size(128.dp))
    }
}