package com.kho.koin.withmodularize.core.navigator

import android.content.Intent

object HomeActivityNavigator : DynamicFeature<Intent> {

    private const val HOME = "com.kho.koin.withmodularize.ui.HomeActivity"

    override val dynamicStart: Intent?
        get() = HOME.loadIntentOrNull()
}