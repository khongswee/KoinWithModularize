package com.kho.koin.withmodularize.core.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kho.koin.withmodularize.core.di.ModuleInject

open class BaseActivity : AppCompatActivity() {

    open fun getDi(): ModuleInject? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getDi()?.let {
            it.dropFeature()
            it.injectFeature()
        }
    }

}