package com.huynn109.template.di


import com.huynn109.template.data.network.remote.ApiService
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit


val apiModule = module {
    single { createApiService(get()) }
}

internal fun createApiService(retrofit: Retrofit) =
        retrofit.create(ApiService::class.java)

