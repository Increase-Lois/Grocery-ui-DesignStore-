package com.semicolon.africa.ui_storedesign.general.components

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import com.semicolon.africa.ui_storedesign.navigation.destination.PrimaryDestination

@Composable
fun BottomNavBar(
    modifier : Modifier,
    navController : NavController,
    destinations: List<PrimaryDestination> = listOf(
    PrimaryDestination.Store,
    PrimaryDestination.Cart,
    PrimaryDestination.Explore,
    PrimaryDestination.Favorite,
    PrimaryDestination.Profile

)
){ val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    BottomNavigation(
        modifier = modifier,
        backgroundColor = Color.White,
        elevation = 0.dp
    ) {
        destinations.forEach { primaryDestination ->
            BottomNavigationItem(
                selected = (
                        currentDestination?.hierarchy?.any { destinationInHierarchy ->
                    destinationInHierarchy.route == primaryDestination.startRoute
                } == true
                        ),
                onClick = {
                    navController.navigate(primaryDestination.startRoute) {
                        launchSingleTop = true      //removes one copy of the page, if there is an extra.
                        restoreState = true
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                    }
                },
                icon = {
                    Icon(
                        painter = painterResource(id = primaryDestination.icon),
                        contentDescription = ""
                    )
                },
                selectedContentColor = Color.Green,
                unselectedContentColor = Color.Black,
                label = {
                    Text(text = primaryDestination.name)
                }
            )
        }
    }
}

