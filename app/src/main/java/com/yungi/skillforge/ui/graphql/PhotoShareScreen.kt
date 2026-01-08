package com.yungi.skillforge.ui.graphql

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
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
import kotlinx.serialization.Serializable

@Serializable
object PhotoShareRoute

fun NavGraphBuilder.allBookScreen() {
    composable<PhotoShareRoute> {
        PhotoShareScreen()
    }
}

fun NavController.navigateToPhotoShareScreen() {
    this.navigate(PhotoShareRoute)
}

@Composable
fun PhotoShareScreen(
    viewModel: PhotoShareModel = hiltViewModel()
) {
    LaunchedEffect(Unit) {
        viewModel.fetchBooks()
    }

    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    Box(Modifier.fillMaxSize()) {
        Text(
            text = "totalPhotos: ${uiState.totalPhotos}, totalUsers: ${uiState.totalUsers}",
            modifier = Modifier.align(Alignment.Center)
        )
    }
}