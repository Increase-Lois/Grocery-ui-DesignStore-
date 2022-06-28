package com.semicolon.africa.ui_storedesign.auth

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.semicolon.africa.ui_storedesign.auth.viewmodel.AuthViewModel
import com.semicolon.africa.ui_storedesign.navigation.navhost.AuthenticationNavigationHost

@Composable
fun AuthenticationWrapper(
    viewModel: AuthViewModel
){
    val navHostController = rememberNavController()
    AuthenticationNavigationHost(navHostController = navHostController,
    authViewModel = viewModel)
}