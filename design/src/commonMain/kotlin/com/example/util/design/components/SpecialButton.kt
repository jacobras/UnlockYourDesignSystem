package com.example.util.design.components

import androidx.compose.foundation.border
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
    onClick: () -> Unit
) {
    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Blue
        ),
        modifier = Modifier.border(
            width = 5.dp,
            color = Color.Blue.copy(red = 0.3f, green = 0.3f),
            shape = ButtonDefaults.shape
        ),
        onClick = onClick
    ) {
        Text(
            text = label,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.ExtraBold
        )
    }
}

@Preview
@Composable
private fun Preview() {
    SpecialTheme {
        SpecialButton("Click me", onClick = {})
    }
}