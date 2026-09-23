package com.example.util.design.components

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.util.design.foundation.SpecialTheme
import nl.jacobras.design.R

@Composable
fun SpecialSpinner(modifier: Modifier = Modifier) {
    // Credits: https://www.iconking.net/free-animation/circle-loader-animation-307
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.loader))
    LottieAnimation(
        composition = composition,
        modifier = modifier,
        iterations = LottieConstants.IterateForever
    )
}

@Preview
@Composable
private fun Preview() {
    SpecialTheme {
        SpecialSpinner(Modifier.size(128.dp))
    }
}