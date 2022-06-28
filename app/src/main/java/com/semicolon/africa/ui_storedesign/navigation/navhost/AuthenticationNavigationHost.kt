package com.semicolon.africa.ui_storedesign.navigation.navhost

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.semicolon.africa.ui_storedesign.auth.screens.Login
import com.semicolon.africa.ui_storedesign.auth.screens.Register
import com.semicolon.africa.ui_storedesign.navigation.destinations.Destination


@Composable
fun AuthenticationNavigationHost(
    navController: NavHostController,
){
    NavHost(navController =navController,
        startDestination = Destination.LoginDestination.route){
        composable(route = Destination.LoginDestination.route){
//            Login()
        }
        composable(route = Destination.SignupDestination.route){
            Register()
        }
    }
}