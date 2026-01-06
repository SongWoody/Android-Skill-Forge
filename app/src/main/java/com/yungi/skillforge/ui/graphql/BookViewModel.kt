package com.yungi.skillforge.ui.graphql

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.apollographql.apollo.ApolloClient
import com.example.app.graphql.GetAllBooksQuery
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

val apolloClient = ApolloClient.Builder()
    .serverUrl("http://10.0.2.2:8181/graphql")
    .addHttpHeader("Content-Type", "application/json")
    .build()

class BookViewModel: ViewModel() {
    val books = MutableStateFlow<List<GetAllBooksQuery.AllBook>>(emptyList())

    fun fetchBooks() {
        viewModelScope.launch {
            try {
                Log.d("GraphQL_Test", "요청 시작...")
                val response = apolloClient.query(GetAllBooksQuery()).execute()

                Log.d("GraphQL_Test", "데이터: ${response.data}")
                Log.d("GraphQL_Test", "에러 목록: ${response.errors}")

                books.value = response.data?.allBooks ?: emptyList()
            } catch (e: Exception) {
                Log.e("GraphQL_Test", "통신 실패 원인: ", e)
            }
        }
    }
}