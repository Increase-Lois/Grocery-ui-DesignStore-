package com.semicolon.africa.ui_storedesign

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.semicolon.africa.ui_storedesign.auth.AuthenticationWrapper
import com.semicolon.africa.ui_storedesign.auth.viewmodel.AuthViewModel

@Composable
fun GroceriesSwitch(
    authViewModel: AuthViewModel = hiltViewModel()
){
    val isAuthenticated = false

    if (isAuthenticated){
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Welcome")
        }
    }else{
        AuthenticationWrapper(
            viewModel = authViewModel
        )

    }
}