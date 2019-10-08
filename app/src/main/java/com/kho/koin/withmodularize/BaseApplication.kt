package com.kho.koin.withmodularize

import android.app.Application
import com.kho.koin.withmodularize.core.TestInject
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.module

class BaseApplication : Application() {

    private val testInject : Module = module {
        single<TestInject>{ TestInject("BaseApplication") }
    }
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@BaseApplication)
            modules( listOf(testInject))
        }
    }
}