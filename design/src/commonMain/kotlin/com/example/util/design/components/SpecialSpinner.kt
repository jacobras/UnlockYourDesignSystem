package com.example.util.design.components

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import io.github.alexzhirkevich.compottie.Compottie
import io.github.alexzhirkevich.compottie.ExperimentalCompottieApi
import io.github.alexzhirkevich.compottie.LottieCompositionSpec
import io.github.alexzhirkevich.compottie.Resource
import io.github.alexzhirkevich.compottie.rememberLottieComposition
import io.github.alexzhirkevich.compottie.rememberLottiePainter
import org.jetbrains.compose.resources.ExperimentalResourceApi
import unlockyourdesignsystem.design.generated.resources.Res

@OptIn(ExperimentalResourceApi::class, ExperimentalCompottieApi::class)
@Composable
fun SpecialSpinner(modifier: Modifier = Modifier) {
    // Credits: https://www.iconking.net/free-animation/circle-loader-animation-307
    val composition by rememberLottieComposition(LottieCompositionSpec.Resource(Res.getUri("files/loader.json")))
    Image(
        painter = rememberLottiePainter(
            composition = composition,
            iterations = Compottie.IterateForever
        ),
        modifier = modifier,
        contentDescription = null
    )
}