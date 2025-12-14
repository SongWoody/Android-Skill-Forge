package com.yungi.skillforge.ui.screen.mainscreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navOptions
import com.yungi.skillforge.ui.navigation.BottomNavItem
import com.yungi.skillforge.ui.screen.mainscreen.tab.bookmarks.bookmarksScreen
import com.yungi.skillforge.ui.screen.mainscreen.tab.history.historyScreen
import com.yungi.skillforge.ui.screen.mainscreen.tab.home.homeScreen
import com.yungi.skillforge.ui.screen.mainscreen.tab.profile.profileScreen
import kotlinx.serialization.Serializable

@Serializable
object MainRoute

@Composable
fun MainScreen() {
    val mainNavController = rememberNavController()
    val navBackStackEntry by mainNavController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Scaffold(
        bottomBar = {
            val bottomNavItems = listOf(
                BottomNavItem.Home,
                BottomNavItem.History,
                BottomNavItem.Bookmarks,
                BottomNavItem.Profile
            )
            NavigationBar {
                bottomNavItems.forEach { item ->
                    NavigationBarItem(
                        selected = currentRoute == item.route,
                        onClick = {
                            mainNavController.navigate(
                                route = item.route,
                                navOptions = navOptions {
                                    popUpTo(mainNavController.graph.findStartDestination().id) {
                                        saveState = true
                                    }
                                    launchSingleTop = true
                                    restoreState = true
                                }
                            )
                        },
                        icon = {
                            Icon(
                                imageVector = item.icon,
                                contentDescription = item.title
                            )
                        },
                        label = { Text(text = item.title) }
                    )
                }
            }
        }
    ) { paddingValues ->
        NavHost(
            modifier = Modifier.padding(paddingValues),
            navController = mainNavController,
            startDestination = BottomNavItem.Home.route
        ) {
            homeScreen()
            historyScreen()
            bookmarksScreen()
            profileScreen()
        }
    }
}
