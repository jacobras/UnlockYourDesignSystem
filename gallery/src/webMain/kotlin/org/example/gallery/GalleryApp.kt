package org.example.gallery

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DarkMode
import androidx.compose.material.icons.filled.LightMode
import androidx.compose.material.icons.filled.TextDecrease
import androidx.compose.material.icons.filled.TextIncrease
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.VerticalDivider
import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.layout.ListDetailPaneScaffold
import androidx.compose.material3.adaptive.layout.ListDetailPaneScaffoldRole
import androidx.compose.material3.adaptive.navigation.rememberListDetailPaneScaffoldNavigator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.util.design.foundation.SpecialTheme
import kotlinx.coroutines.launch
import nl.jacobras.composeactionmenu.ActionMenu
import nl.jacobras.composeactionmenu.RegularActionItem

@OptIn(ExperimentalMaterial3AdaptiveApi::class)
@Composable
internal fun GalleryApp() {
    SpecialTheme(darkTheme = GalleryState.darkTheme) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Text(
                            text = "Gallery",
                            style = MaterialTheme.typography.titleLarge
                        )
                    },
                    actions = {
                        ActionMenu(
                            items = listOf(
                                RegularActionItem(
                                    key = "fontScale",
                                    title = "Font scale",
                                    iconVector = when (GalleryState.fontScale) {
                                        FontScale.Regular -> Icons.Default.TextIncrease
                                        FontScale.Large -> Icons.Default.TextDecrease
                                    },
                                    onClick = {
                                        GalleryState.fontScale = GalleryState.fontScale.next()
                                    }
                                ),
                                RegularActionItem(
                                    key = "darkTheme",
                                    title = "Dark theme",
                                    iconVector = if (GalleryState.darkTheme) {
                                        Icons.Default.LightMode
                                    } else {
                                        Icons.Default.DarkMode
                                    },
                                    onClick = { GalleryState.darkTheme = !GalleryState.darkTheme }
                                )
                            )
                        )
                    }
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
                        Column(Modifier.preferredWidth(260.dp)) {
                            for (screen in Screen.entries) {
                                ScreenListItem(
                                    title = screen.title,
                                    selected = navigator.currentDestination?.contentKey == screen,
                                    onClick = {
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
                    },
                    paneExpansionDragHandle = {
                        Box(contentAlignment = Alignment.Center) {
                            VerticalDivider()
                        }
                    }
                )
            }

            LaunchedEffect(Unit) {
                // Preselect first entry
                navigator.navigateTo(
                    pane = ListDetailPaneScaffoldRole.Detail,
                    contentKey = Screen.entries.first()
                )
            }
        }
    }
}

@Composable
private fun ScreenListItem(
    title: String,
    selected: Boolean,
    onClick: () -> Unit
) {
    Text(
        text = title,
        fontWeight = if (selected) {
            FontWeight.Bold
        } else {
            FontWeight.Normal
        },
        style = MaterialTheme.typography.bodyLarge,
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(horizontal = 16.dp, vertical = 4.dp)
    )
}