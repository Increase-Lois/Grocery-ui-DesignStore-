package com.semicolon.africa.ui_storedesign.data.remote.request

import com.semicolon.africa.ui_storedesign.auth.events.LoginFormEvent

data class LoginRequest(
    val email:String,
    val password: String
)
