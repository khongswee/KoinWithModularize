package com.kho.koin.withmodularize.data.login.repository

import com.kho.koin.withmodularize.data.login.api.LoginService
import com.kho.koin.withmodularize.data.login.model.LoginRequest
import com.kho.koin.withmodularize.data.login.model.LoginResponse
import kotlinx.coroutines.Deferred

interface LoginRepository {
    fun postLogin(request: LoginRequest): Deferred<LoginResponse>
}

class LoginRepositoryImpl(private val service: LoginService) : LoginRepository {
    override fun postLogin(request: LoginRequest): Deferred<LoginResponse> {
        return service.postLogin(request)
//        return create(CompletableFuture.completedFuture(LoginResponse("")))
    }
}

