package com.semicolon.africa.ui_storedesign.data.repositories

import com.semicolon.africa.ui_storedesign.data.remote.Api
import com.semicolon.africa.ui_storedesign.data.remote.request.LoginRequest
import com.semicolon.africa.ui_storedesign.data.remote.response.LoginResponse
import com.semicolon.africa.ui_storedesign.domain.repositories.UserRepository

class UserRepositoryImpl(
    private val api:Api ):UserRepository {
    override suspend fun login(request: LoginRequest): LoginResponse {
        return api.login(request)
    }
}