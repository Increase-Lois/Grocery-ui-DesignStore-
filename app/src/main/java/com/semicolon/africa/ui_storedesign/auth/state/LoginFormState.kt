package com.semicolon.africa.ui_storedesign.auth.state

data class LoginFormState(
    val email: String ="",
    val emailValid: Boolean = true,
    val emailErrorMessage: String ="",
    val password: String="",
    val passwordValid:Boolean = true,
    val passwordErrorMessage :String ="",
    val formValid : Boolean = true
)