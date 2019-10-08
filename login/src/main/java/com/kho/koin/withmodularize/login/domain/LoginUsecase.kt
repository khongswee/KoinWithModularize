package com.kho.koin.withmodularize.login.domain

import com.kho.koin.withmodularize.core.BaseUseCaseCorutine
import com.kho.koin.withmodularize.data.login.model.LoginRequest
import com.kho.koin.withmodularize.data.login.model.LoginResponse
import com.kho.koin.withmodularize.data.login.repository.LoginRepository

class LoginUsecase(private val repository: LoginRepository) : BaseUseCaseCorutine<LoginResponse, LoginRequest>() {
    override suspend fun build(params: LoginRequest?): LoginResponse {
        params?.let {
            return repository.postLogin(params).await()
        }?:run {
            throw IllegalAccessException("Param null")
        }
    }
}