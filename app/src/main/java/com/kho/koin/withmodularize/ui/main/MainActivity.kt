package com.kho.koin.withmodularize.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kho.koin.withmodularize.R
import com.kho.koin.withmodularize.navigator.LoginActivityNavigator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        goToLogin()
    }

    private fun goToLogin() {
        val intent = LoginActivityNavigator.dynamicStart
        startActivity(intent)
    }

}
