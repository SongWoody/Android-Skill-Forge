package com.yungi.skillforge.ui.screen.mainscreen.tab.bookmarks

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
object BookmarksRoute: NavKey

fun EntryProviderScope<NavKey>.bookmarksScreen() {
    entry<BookmarksRoute> {
        BookmarksScreen()
    }
}


@Composable
fun BookmarksScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Bookmarks Screen")
    }
}
