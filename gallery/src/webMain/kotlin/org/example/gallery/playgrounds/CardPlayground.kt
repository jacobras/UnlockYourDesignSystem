package org.example.gallery.playgrounds

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.example.util.design.components.SpecialCard
import org.example.gallery.playgrounds.util.Playground
import org.example.gallery.playgrounds.util.controls.LabelControl
import org.jetbrains.compose.resources.painterResource
import unlockyourdesignsystem.design.generated.resources.Res
import unlockyourdesignsystem.design.generated.resources.cat_derp

@Composable
fun CardPlayground() {
    val state = remember { CardPlaygroundState() }

    Playground(
        component = {
            SpecialCard(
                title = state.title.value,
                content = state.content.value,
                image = painterResource(Res.drawable.cat_derp)
            )
        },
        controls = { CardPlaygroundControls(state) }
    )
}

@Composable
private fun CardPlaygroundControls(state: CardPlaygroundState) {
    LabelControl(
        name = "Title",
        state = state.title
    )
    LabelControl(
        name = "Content",
        state = state.content
    )
}

private class CardPlaygroundState {
    var title = mutableStateOf("Hello")
    var content = mutableStateOf("Some content")
}