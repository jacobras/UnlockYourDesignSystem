package org.example.gallery

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.layout.ListDetailPaneScaffold
import androidx.compose.material3.adaptive.layout.ListDetailPaneScaffoldRole
import androidx.compose.material3.adaptive.navigation.rememberListDetailPaneScaffoldNavigator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.util.design.foundation.SpecialTheme
import kotlinx.coroutines.launch

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
            val navigator = rememberListDetailPaneScaffoldNavigator<Screen>()
            val scope = rememberCoroutineScope()

            Box(modifier = Modifier.padding(paddingValues)) {
                ListDetailPaneScaffold(
                    directive = navigator.scaffoldDirective,
                    value = navigator.scaffoldValue,
                    listPane = {
                        Column {
                            for (screen in Screen.entries) {
                                Text(
                                    text = screen.title,
                                    modifier = Modifier.clickable {
                                        scope.launch {
                                            navigator.navigateTo(
                                                pane = ListDetailPaneScaffoldRole.Detail,
                                                contentKey = screen
                                            )
                                        }
                                    }
                                )
                            }
                        }
                    },
                    detailPane = {
                        val screen = navigator.currentDestination?.contentKey
                        if (screen != null) {
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.TopCenter
                            ) {
                                screen.content()
                            }
                        }
                    }
                )
            }
        }
    }
}