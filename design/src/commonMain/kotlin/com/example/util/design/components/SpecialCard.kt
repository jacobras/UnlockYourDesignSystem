package com.example.util.design.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.util.design.foundation.SpecialTheme
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import unlockyourdesignsystem.design.generated.resources.Res
import unlockyourdesignsystem.design.generated.resources.cat_derp
import unlockyourdesignsystem.design.generated.resources.read_more

@Composable
fun SpecialCard(
    title: String,
    content: String,
    image: Painter,
    modifier: Modifier = Modifier
) {
    Card(modifier) {
        Column(
            modifier = Modifier.padding(12.dp, 8.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text(
                style = MaterialTheme.typography.titleLarge.copy(
                    color = MaterialTheme.colorScheme.primary
                ),
                text = title
            )

            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Image(
                    modifier = Modifier.size(120.dp, 80.dp),
                    painter = image,
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )
                Text(
                    style = MaterialTheme.typography.bodyMedium.copy(
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    ),
                    text = content
                )
            }

            Text(
                style = MaterialTheme.typography.bodyMedium.copy(
                    color = MaterialTheme.colorScheme.primary
                ),
                text = stringResource(Res.string.read_more)
            )
        }
    }
}

@Preview
@Composable
private fun Preview() {
    SpecialTheme {
        SpecialCard(
            title = "Nice card",
            content = "Content",
            image = painterResource(Res.drawable.cat_derp)
        )
    }
}