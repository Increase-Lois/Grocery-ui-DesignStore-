package com.semicolon.africa.ui_storedesign.navigation.navhost

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.semicolon.africa.ui_storedesign.auth.screens.Login
import com.semicolon.africa.ui_storedesign.auth.screens.Register
import com.semicolon.africa.ui_storedesign.auth.viewmodel.AuthViewModel
import com.semicolon.africa.ui_storedesign.navigation.destinations.Destination


@Composable
fun AuthenticationNavigationHost(
    navHostController: NavHostController,
    authViewModel: AuthViewModel
){
    NavHost(
        navController =navHostController,
        startDestination = Destination.LoginDestination.route
    ){
        composable(route = Destination.LoginDestination.route){
            Login(
                navController = navHostController,
                authViewModel = authViewModel
            )
        }
        composable(route = Destination.SignupDestination.route){
            Register(navController = navHostController)
        }
    }
}