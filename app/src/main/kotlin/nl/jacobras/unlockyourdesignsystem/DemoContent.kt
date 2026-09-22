package nl.jacobras.unlockyourdesignsystem

import androidx.annotation.DrawableRes
import nl.jacobras.design.R

object DemoContent {
    val cards = listOf(
        CardItem(
            title = "HumanReadable",
            content = "A small set of data formatting utilities for Kotlin Multiplatform (KMP).",
            image = R.drawable.gogh_rhone
        ),
        CardItem(
            title = "ComposeActionMenu",
            content = "An easy-to-use action/overflow menu for Compose UI.",
            image = R.drawable.monet_etretat
        ),
        CardItem(
            title = "CloudBridge",
            content = "Multiple clouds, one Kotlin Multiplatform bridge.",
            image = R.drawable.monet_giverny
        ),
    )
}

class CardItem(
    val title: String,
    val content: String,
    @DrawableRes val image: Int
)