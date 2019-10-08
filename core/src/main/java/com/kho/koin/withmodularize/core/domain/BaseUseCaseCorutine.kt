package com.kho.koin.withmodularize.core

import kotlinx.coroutines.*

abstract class BaseUseCaseCorutine<Data, in Param> {
    private var parentJob: Job = Job()
    protected abstract suspend fun build(params: Param? = null): Data
    open fun excute(onSuccess: (Data) -> Unit, onError: (Exception) -> Unit, params: Param? = null) {
        CoroutineScope(Dispatchers.Main + parentJob).launch {
            try {
                val result = withContext(Dispatchers.IO) {
                    build(params)
                }
                onSuccess(result)

            } catch (ex: Exception) {
                onError(ex)
            }
        }
    }

    fun unsubscribe() {
        parentJob.apply {
            cancelChildren()
            cancel()
        }
    }

    object None
}