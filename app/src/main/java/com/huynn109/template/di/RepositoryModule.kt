package com.huynn109.template.di

import com.huynn109.template.data.network.ApiRepository
import io.reactivex.schedulers.Schedulers
import org.koin.dsl.module


val repositoryModule = module {
    single { ApiRepository(get()) }
}