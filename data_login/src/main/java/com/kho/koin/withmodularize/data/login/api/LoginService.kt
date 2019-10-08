package com.kho.koin.withmodularize.data.login.api

import com.kho.koin.withmodularize.data.login.model.LoginRequest
import com.kho.koin.withmodularize.data.login.model.LoginResponse
import kotlinx.coroutines.Deferred
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginService {
    @POST
    fun postLogin(@Body request: LoginRequest): Deferred<LoginResponse>
}