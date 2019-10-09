package com.kho.koin.withmodularize.home.di

import com.kho.koin.withmodularize.core.di.ModuleInject
import com.kho.koin.withmodularize.home.viewmodel.HomeViewModel
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object HomeModule : ModuleInject {

    private val loadModule by lazy {
        loadKoinModules(
            listOf(viewModel)
        )
    }

    private val viewModel: Module = module {
        factory { HomeViewModel(get()) }
    }
    override fun dropFeature(): Unit? {
        return null
    }

    override fun injectFeature() {
        loadModule
    }
}