package com.huynn109.template.ui.main

import com.huynn109.template.base.BaseViewModel
import com.huynn109.template.domain.usecases.NewsUseCase
import io.reactivex.Scheduler

/**
 * Created by huynn109 on 2019-07-01.
 */
class MainViewModel(private val newsUseCase: NewsUseCase, private val scheduler: Scheduler) : BaseViewModel()
