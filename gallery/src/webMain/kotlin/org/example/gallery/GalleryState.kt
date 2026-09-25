package org.example.gallery

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

object GalleryState {
    var darkTheme by mutableStateOf(false)
    var fontScale by mutableStateOf(FontScale.Regular)
}

enum class FontScale(val scale: Float) {
    Regular(1.0f),
    Large(2.0f);

    fun next(): FontScale {
        return when (this) {
            Regular -> Large
            Large -> Regular
        }
    }
}