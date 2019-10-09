package com.kho.koin.withmodularize.home.ui

import android.os.Bundle
import android.widget.Toast
import com.kho.koin.withmodularize.core.di.ModuleInject
import com.kho.koin.withmodularize.core.ui.BaseActivity
import com.kho.koin.withmodularize.home.R
import com.kho.koin.withmodularize.home.di.HomeModule
import com.kho.koin.withmodularize.home.viewmodel.HomeViewModel

import kotlinx.android.synthetic.main.activity_home.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeActivity : BaseActivity() {

    private val viewModel: HomeViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setSupportActionBar(toolbar)

        Toast.makeText(this, viewModel.getKey(), Toast.LENGTH_LONG).show()
    }

    override fun getDi(): ModuleInject? {
        return HomeModule
    }

}
