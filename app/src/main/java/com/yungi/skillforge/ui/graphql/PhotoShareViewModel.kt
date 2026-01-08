package com.yungi.skillforge.ui.graphql

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.apollographql.apollo.ApolloClient
import com.example.app.graphql.TotalQuery
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

val apolloClient = ApolloClient.Builder()
    .serverUrl("http://10.0.2.2:4000/graphql")
    .addHttpHeader("Content-Type", "application/json")
    .build()

class PhotoShareModel: ViewModel() {
    private val _uiState = MutableStateFlow<UiState>(
        UiState()
    )
    val uiState = _uiState.asStateFlow()

    fun fetchBooks() {
        viewModelScope.launch {
            try {
                Log.d("GraphQL_Test", "요청 시작...")
                val response = apolloClient.query(TotalQuery()).execute()

                Log.d("GraphQL_Test", "데이터: ${response.data}")
                Log.d("GraphQL_Test", "에러 목록: ${response.errors}")

                _uiState.update { currentState ->
                    currentState.copy(
                        totalPhotos = response.data?.totalPhotos ?: currentState.totalPhotos,
                        totalUsers = response.data?.totalUsers ?: currentState.totalUsers,
                    )
                }
            } catch (e: Exception) {
                Log.e("GraphQL_Test", "통신 실패 원인: ", e)
            }
        }
    }

    data class UiState(
        val totalPhotos: Int = 0,
        val totalUsers: Int = 0
    )
}