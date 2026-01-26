package com.yungi.skillforge.ui.graphql

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entryProvider
import kotlinx.serialization.Serializable

@Serializable
object AllBooksRoute: NavKey

fun EntryProviderScope<NavKey>.allBookScreen() {
    entry<AllBooksRoute> {
        AllBooksScreen()
    }
}

@Composable
fun AllBooksScreen(
    viewModel: BookViewModel = hiltViewModel()
) {
    LaunchedEffect(Unit) {
        viewModel.fetchBooks()
    }

    val books by viewModel.books.collectAsStateWithLifecycle()

    if (books.isEmpty()) {
        Box(Modifier.fillMaxSize()) {
            Text(text = "empty list", modifier = Modifier.align(Alignment.Center))
        }
    } else {
        LazyColumn {
            items(books) { book ->
                Text(text = "제목: ${book.title}, 저자: ${book.author}")
            }
        }
    }
}