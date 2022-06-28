package com.semicolon.africa.ui_storedesign.domain.repositories

import com.semicolon.africa.ui_storedesign.data.remote.request.LoginRequest
import com.semicolon.africa.ui_storedesign.data.remote.response.LoginResponse

interface UserRepository {
    suspend fun login(request:LoginRequest):LoginResponse
}