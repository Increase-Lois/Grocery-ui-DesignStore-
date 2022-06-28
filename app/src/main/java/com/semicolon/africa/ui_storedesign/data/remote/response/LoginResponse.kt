package com.semicolon.africa.ui_storedesign.data.remote.response

import com.semicolon.africa.ui_storedesign.data.models.User

data class LoginResponse(
    val status:String,
    val token : String,
    val data: User
)
