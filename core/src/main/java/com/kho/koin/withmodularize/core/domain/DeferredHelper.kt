package com.kho.koin.withmodularize.core.domain

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import java.util.concurrent.CompletableFuture
import java.util.function.Supplier

// Helper for java written in Kotlin
object DeferredHelper {

  @JvmStatic
  fun <T> create(future: CompletableFuture<T>): Deferred<T> = CoroutineScope(Dispatchers.IO).async { future.get() }

//  @JvmStatic
//  fun <T> create(supplier: Supplier<T>): Deferred<T> = async { supplier.get() }
}