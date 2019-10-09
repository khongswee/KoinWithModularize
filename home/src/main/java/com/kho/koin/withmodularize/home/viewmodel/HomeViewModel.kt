package com.kho.koin.withmodularize.home.viewmodel

import androidx.lifecycle.ViewModel
import com.kho.koin.withmodularize.core.TestInject

class HomeViewModel(private val testInject: TestInject) : ViewModel() {

    fun getKey() = testInject.getKey()
}