package com.kho.koin.withmodularize.navigator

import android.content.Intent

object LoginActivityNavigator : DynamicFeature<Intent> {

    private const val LOGIN = "com.kho.koin.withmodularize.login.ui.LoginActivity"

    override val dynamicStart: Intent?
        get() = LOGIN.loadIntentOrNull()
}