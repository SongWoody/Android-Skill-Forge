package com.yungi.skillforge.ui.screen.mainscreen

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector
import kotlinx.serialization.Serializable

sealed class BottomNavItem<T>(
    val icon: ImageVector,
    val title: String,
    val route: T
) {
    data object Home : BottomNavItem<HomeRoute>(
        icon = Icons.Default.Home,
        title = "홈",
        route = HomeRoute
    )

    data object History : BottomNavItem<HistoryRoute>(
        icon = Icons.Default.DateRange,
        title = "기록",
        route = HistoryRoute
    )

    data object Bookmarks : BottomNavItem<BookmarksRoute>(
        icon = Icons.Default.FavoriteBorder,
        title = "북마크",
        route = BookmarksRoute
    )

    data object Profile : BottomNavItem<ProfileRoute>(
        icon = Icons.Default.AccountCircle,
        title = "프로필",
        route = ProfileRoute
    )
}

@Serializable
object HomeRoute

@Serializable
object HistoryRoute

@Serializable
object BookmarksRoute

@Serializable
object ProfileRoute
