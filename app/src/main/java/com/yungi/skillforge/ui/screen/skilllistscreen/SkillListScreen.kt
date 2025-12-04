package com.yungi.skillforge.ui.screen.skilllistscreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

@Serializable object SkillListRoute

fun NavGraphBuilder.skillListScreen() {
    composable<SkillListRoute> {
        SkillListScreen()
    }
}

@Composable
fun SkillListScreen(
    viewModel: SkillListViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            uiState.text,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}