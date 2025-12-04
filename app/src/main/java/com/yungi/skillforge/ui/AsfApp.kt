package com.yungi.skillforge.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.yungi.skillforge.ui.screen.skilllistscreen.SkillListRoute
import com.yungi.skillforge.ui.screen.skilllistscreen.skillListScreen
import com.yungi.skillforge.ui.theme.AndroidSkillForgeTheme

@Composable
fun AsfApp() {
    val navController = rememberNavController()

    AndroidSkillForgeTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            NavHost(
                navController = navController,
                startDestination = SkillListRoute,
                modifier = Modifier.fillMaxSize().padding(innerPadding)
            ) {
                skillListScreen()
            }
        }
    }
}