package com.huynn109.template.di

import com.huynn109.template.data.network.remote.RemoteDataSource
import io.reactivex.schedulers.Schedulers

import org.koin.dsl.module

val dataSourceModule = module {
    factory { RemoteDataSource(get(), Schedulers.io()) }
}