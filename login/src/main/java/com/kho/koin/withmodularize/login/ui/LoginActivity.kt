package com.kho.koin.withmodularize.login.ui

import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import com.kho.koin.withmodularize.core.di.ModuleInject
import com.kho.koin.withmodularize.core.ui.BaseActivity
import com.kho.koin.withmodularize.login.R
import com.kho.koin.withmodularize.login.di.LoginModule
import com.kho.koin.withmodularize.login.viewmodel.LoginViewmodel
import kotlinx.android.synthetic.main.activity_login.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginActivity : BaseActivity() {

    override fun getDi(): ModuleInject? {
        return LoginModule
    }

    private val loginViewModel: LoginViewmodel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        handleLogin()
        handelResponse()
    }

    private fun handleLogin() {
        login.setOnClickListener {
            val username = username.text.toString()
            val password = password.text.toString()
            loginViewModel.postLogin(username, password)
        }
    }

    private fun handelResponse() {
        loginViewModel.message.observe(this, Observer {
            Toast.makeText(this,it,Toast.LENGTH_SHORT).show()
        })
    }

}


