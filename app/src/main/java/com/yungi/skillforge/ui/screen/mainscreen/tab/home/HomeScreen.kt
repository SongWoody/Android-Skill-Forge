package com.yungi.skillforge.ui.screen.mainscreen.tab.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.yungi.skillforge.ui.navigation.HomeRoute

fun NavGraphBuilder.homeScreen(
    navigateToAllBookScreen: ()-> Unit
) {
    composable<HomeRoute> {
        HomeScreen(
            navigateToAllBookScreen
        )
    }
}

@Composable
fun HomeScreen(
    navigateToAllBookScreen: ()-> Unit,
    viewModel: HomeViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            uiState.text,
            modifier = Modifier.align(Alignment.Center)
        )

        Button(
            onClick = navigateToAllBookScreen,
            modifier = Modifier.align(Alignment.BottomCenter)
        ) {
            Text("Navigate to AllBookScreen")
        }
    }
}