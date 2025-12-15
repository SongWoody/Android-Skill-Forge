package com.yungi.skillforge.ui.screen.mainscreen.tab.profile

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.yungi.skillforge.ui.screen.mainscreen.ProfileRoute

fun NavGraphBuilder.profileScreen() {
    composable<ProfileRoute> {
        ProfileScreen()
    }
}

@Composable
fun ProfileScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Profile Screen")
    }
}
