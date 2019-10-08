package com.kho.koin.withmodularize.login.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kho.koin.withmodularize.data.login.model.LoginRequest
import com.kho.koin.withmodularize.login.domain.LoginUsecase

class LoginViewmodel(private val usecase: LoginUsecase) : ViewModel() {

    val message = MutableLiveData<String>()

    fun postLogin(username: String, password: String) {
        usecase.excute({
            message.value = it.message
        },{
            message.value = it.localizedMessage
        }, LoginRequest(username,password))
    }
}