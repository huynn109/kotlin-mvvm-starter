package com.huynn109.template.di

import com.huynn109.template.domain.*
import com.huynn109.template.domain.usecases.AccountUseCase
import com.huynn109.template.domain.usecases.AccountUseCaseImpl
import com.huynn109.template.domain.usecases.MapUseCase
import com.huynn109.template.domain.usecases.MapUseCaseImpl
import com.huynn109.template.domain.usecases.NewsUseCase
import com.huynn109.template.domain.usecases.NewsUseCaseImpl
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import org.koin.dsl.module

val useCaseModule = module {
    single<AccountUseCase> { AccountUseCaseImpl(get(), scheduler = AndroidSchedulers.mainThread()) }
    single<NewsUseCase> { NewsUseCaseImpl(get()) }
    single<MapUseCase> { MapUseCaseImpl(get()) }
}

