package com.yungi.skillforge.ui.screen.mainscreen

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navOptions
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.yungi.skillforge.ui.screen.mainscreen.tab.bookmarks.bookmarksScreen
import com.yungi.skillforge.ui.screen.mainscreen.tab.history.historyScreen
import com.yungi.skillforge.ui.screen.mainscreen.tab.home.HomeScreen
import com.yungi.skillforge.ui.screen.mainscreen.tab.home.homeScreen
import com.yungi.skillforge.ui.screen.mainscreen.tab.profile.profileScreen
import kotlinx.serialization.Serializable

@Serializable
object MainRoute

@Composable
fun MainScreen() {
    val backStack = rememberNavBackStack(BottomNavItem.Home.route)
    val currentRoute = backStack.lastOrNull()

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
                            backStack.clear()
                            backStack.add(item.route)
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
        NavDisplay(
            modifier = Modifier.padding(paddingValues),
            backStack = backStack,
            onBack = {
                backStack.removeLastOrNull()
            },
            entryProvider = entryProvider {
                homeScreen()
                historyScreen()
                bookmarksScreen()
                profileScreen()
            }
        )
    }
}
