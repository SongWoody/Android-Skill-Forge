package com.yungi.skillforge.ui.screen.skilllistscreen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class SkillListViewModel @Inject constructor(): ViewModel() {

    private val _uiState = MutableStateFlow(UiState("Hello Skill List Screen"))
    val uiState = _uiState.asStateFlow()

    data class UiState(
        val text: String
    )
}