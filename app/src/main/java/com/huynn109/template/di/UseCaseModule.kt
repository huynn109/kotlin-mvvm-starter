package com.huynn109.template.di

import com.huynn109.template.domain.*
import org.koin.dsl.module


val useCaseModule = module {
    single<AccountUseCase> { AccountUseCaseImpl(get()) }
    single<NewsUseCase> { NewsUseCaseImpl(get()) }
    single<MapUseCase> { MapUseCaseImpl(get()) }
}

