package com.semicolon.africa.ui_storedesign.auth.state

import androidx.core.app.NotificationCompat

data class AuthState(
    val isAuthenticated :Boolean = false,
    val isLoading:Boolean = false,
    val errorOccurred :Boolean = false,
    val errorMessage: String =""
)
