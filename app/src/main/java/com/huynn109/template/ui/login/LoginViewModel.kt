package com.huynn109.template.ui.login

import com.huynn109.template.base.BaseViewModel
import com.huynn109.template.domain.usecases.AccountUseCase
import io.reactivex.Scheduler

/**
 * Created by huynn109 on 2019-07-02.
 */
class LoginViewModel(private val accountUseCase: AccountUseCase, private val scheduler: Scheduler): BaseViewModel()
