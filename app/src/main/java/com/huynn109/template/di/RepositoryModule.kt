package com.huynn109.template.di

import com.huynn109.template.data.source.network.ApiRepository
import org.koin.dsl.module


val repositoryModule = module {
    single { ApiRepository(get()) }
}