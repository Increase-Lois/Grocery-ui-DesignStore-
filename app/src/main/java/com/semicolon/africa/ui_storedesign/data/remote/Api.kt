package com.semicolon.africa.ui_storedesign.data.remote

import com.semicolon.africa.ui_storedesign.data.remote.request.LoginRequest
import com.semicolon.africa.ui_storedesign.data.remote.response.LoginResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface Api {
    @POST("api/v1/auth/login")
    suspend fun login(@Body request: LoginRequest):LoginResponse
}