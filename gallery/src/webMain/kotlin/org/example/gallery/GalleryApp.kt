package org.example.gallery

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.layout.ListDetailPaneScaffold
import androidx.compose.material3.adaptive.navigation.rememberListDetailPaneScaffoldNavigator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.util.design.foundation.SpecialTheme
import org.example.gallery.playgrounds.CardPlayground

@OptIn(ExperimentalMaterial3AdaptiveApi::class)
@Composable
internal fun GalleryApp() {
    SpecialTheme(darkTheme = false) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text("Gallery") }
                )
            }
        ) { paddingValues ->
            val navigator = rememberListDetailPaneScaffoldNavigator()

            Box(modifier = Modifier.padding(paddingValues)) {
                ListDetailPaneScaffold(
                    directive = navigator.scaffoldDirective,
                    value = navigator.scaffoldValue,
                    listPane = {
                        Text("List...")
                    },
                    detailPane = {
                        CardPlayground()
                    }
                )
            }
        }
    }
}