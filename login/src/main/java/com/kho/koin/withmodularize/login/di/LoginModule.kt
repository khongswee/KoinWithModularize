package com.kho.koin.withmodularize.login.di

import com.kho.koin.withmodularize.core.di.ModuleInject
import com.kho.koin.withmodularize.core.domain.DeferredHelper.create
import com.kho.koin.withmodularize.data.login.api.LoginService
import com.kho.koin.withmodularize.data.login.model.LoginRequest
import com.kho.koin.withmodularize.data.login.model.LoginResponse
import com.kho.koin.withmodularize.data.login.repository.LoginRepository
import com.kho.koin.withmodularize.data.login.repository.LoginRepositoryImpl
import com.kho.koin.withmodularize.login.domain.LoginUsecase
import com.kho.koin.withmodularize.login.viewmodel.LoginViewmodel
import kotlinx.coroutines.Deferred
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module
import java.util.concurrent.CompletableFuture

object LoginModule : ModuleInject {

    private val loadModule by lazy {
        loadKoinModules(
            listOf(viewModel, usecase, repository, service)
        )
    }

    private val service: Module = module {
        single<LoginService> {
            //fake service
            object : LoginService {
                override fun postLogin(request: LoginRequest): Deferred<LoginResponse> {
                    return create(CompletableFuture.completedFuture(LoginResponse("Welcome "+request.username)))
                }
            }
        }
    }

    private val repository: Module = module {
        single<LoginRepository> { LoginRepositoryImpl(get()) }
    }

    private val usecase: Module = module {
        single { LoginUsecase(get()) }
    }

    private val viewModel: Module = module {
        factory { LoginViewmodel(get()) }
    }


    override fun dropFeature(): Unit? {
        return null
    }

    override fun injectFeature() {
        loadModule
    }
}