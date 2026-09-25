package com.example.util.design.components

import androidx.compose.foundation.border
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.util.design.foundation.SpecialTheme

@Composable
fun SpecialButton(
    label: String,
    enabled: Boolean = true,
    onClick: () -> Unit
) {
    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Blue
        ),
        modifier = Modifier.border(
            width = 5.dp,
            color = if (enabled) {
                Color.Blue.copy(red = 0.3f, green = 0.3f)
            } else {
                Color.Gray
            },
            shape = ButtonDefaults.shape
        ),
        enabled = enabled,
        onClick = onClick
    ) {
        Text(
            text = label,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.ExtraBold,
            color = if (enabled) {
                Color.White
            } else {
                LocalContentColor.current
            }
        )
    }
}

@Preview
@Composable
private fun PreviewLight() {
    SpecialTheme(darkTheme = false) {
        SpecialButton("Click me", onClick = {})
    }
}

@Preview
@Composable
private fun PreviewLightDisabled() {
    SpecialTheme(darkTheme = false) {
        SpecialButton("Click me", enabled = false, onClick = {})
    }
}

@Preview
@Composable
private fun PreviewDark() {
    SpecialTheme(darkTheme = true) {
        SpecialButton("Click me", onClick = {})
    }
}

@Preview
@Composable
private fun PreviewDarkDisabled() {
    SpecialTheme(darkTheme = true) {
        SpecialButton("Click me", enabled = false, onClick = {})
    }
}