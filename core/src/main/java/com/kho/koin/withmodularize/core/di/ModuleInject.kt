package com.kho.koin.withmodularize.core.di

interface ModuleInject {
    fun dropFeature():Unit?
    fun injectFeature():Unit
}