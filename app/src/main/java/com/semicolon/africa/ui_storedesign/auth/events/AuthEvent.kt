package com.semicolon.africa.ui_storedesign.auth.events

import androidx.core.app.NotificationCompat

sealed class AuthEvent{
    data class Login(
        val email:String,
        val password: String
    ):AuthEvent()

    object LoginSuccess :AuthEvent()
    data class LoginFailure(val message: String): AuthEvent()
}
