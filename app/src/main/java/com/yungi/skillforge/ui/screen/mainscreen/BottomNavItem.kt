package com.yungi.skillforge.ui.screen.mainscreen

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation3.runtime.NavKey
import com.yungi.skillforge.ui.screen.mainscreen.tab.bookmarks.BookmarksRoute
import com.yungi.skillforge.ui.screen.mainscreen.tab.history.HistoryRoute
import com.yungi.skillforge.ui.screen.mainscreen.tab.home.HomeRoute
import com.yungi.skillforge.ui.screen.mainscreen.tab.profile.ProfileRoute
import kotlinx.serialization.Serializable

sealed class BottomNavItem(
    val icon: ImageVector,
    val title: String,
    val route: NavKey
) {
    data object Home : BottomNavItem(
        icon = Icons.Default.Home,
        title = "홈",
        route = HomeRoute
    )

    data object History : BottomNavItem(
        icon = Icons.Default.DateRange,
        title = "기록",
        route = HistoryRoute
    )

    data object Bookmarks : BottomNavItem(
        icon = Icons.Default.FavoriteBorder,
        title = "북마크",
        route = BookmarksRoute
    )

    data object Profile : BottomNavItem(
        icon = Icons.Default.AccountCircle,
        title = "프로필",
        route = ProfileRoute
    )
}