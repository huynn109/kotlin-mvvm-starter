package com.huynn109.template.di


import com.huynn109.template.data.source.network.remote.ApiService
import org.koin.dsl.module
import retrofit2.Retrofit


val apiModule = module {
    single { createApiService(get()) }
}

internal fun createApiService(retrofit: Retrofit) =
        retrofit.create(ApiService::class.java)

