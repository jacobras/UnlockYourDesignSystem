package org.example.gallery.playgrounds

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.util.design.components.SpecialCard
import org.example.gallery.playgrounds.util.provideGalleryFontSize
import org.jetbrains.compose.resources.painterResource
import unlockyourdesignsystem.design.generated.resources.Res
import unlockyourdesignsystem.design.generated.resources.cat_derp

@Composable
fun CardPlayground() {
    val state = remember { CardPlaygroundState() }

    Column {
        provideGalleryFontSize {
            SpecialCard(
                title = state.title,
                content = state.content,
                image = painterResource(Res.drawable.cat_derp)
            )
        }
        CardPlaygroundControls(state)
    }
}

@Composable
private fun CardPlaygroundControls(state: CardPlaygroundState) {
    Column {
        TextField(
            value = state.title,
            onValueChange = { state.title = it }
        )
        TextField(
            value = state.content,
            onValueChange = { state.content = it }
        )
    }
}

private class CardPlaygroundState {
    var title by mutableStateOf("Hello")
    var content by mutableStateOf("Some content")
}