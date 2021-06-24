package com.huynn109.template.di

import com.huynn109.template.ui.login.LoginViewModel
import com.huynn109.template.ui.main.MainViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module


val viewModelModule = module {
    viewModel { LoginViewModel(accountUseCase = get(), scheduler = AndroidSchedulers.mainThread()) }
    viewModel { MainViewModel(newsUseCase = get(), scheduler = AndroidSchedulers.mainThread()) }
}
