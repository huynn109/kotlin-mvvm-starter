package com.huynn109.template.domain.usecases

import com.huynn109.template.data.model.req.LoginReq
import com.huynn109.template.data.model.res.BaseRes
import com.huynn109.template.data.model.res.LoginRes
import com.huynn109.template.data.network.ApiRepository
import io.reactivex.Observable
import io.reactivex.Scheduler
import io.reactivex.Single
import java.util.concurrent.TimeUnit

/**
 * Created by huynn109 on 2019-07-01.
 */

interface AccountUseCase {
    fun login(loginReq: LoginReq): Single<LoginRes>
    fun logout(): Single<BaseRes>
}

class AccountUseCaseImpl(
    private val apiRepository: ApiRepository,
    private val scheduler: Scheduler
) : AccountUseCase {

    override fun login(loginReq: LoginReq): Single<LoginRes> {
        return createLoginSingle(loginReq = loginReq)
    }

    private fun createLoginSingle(loginReq: LoginReq): Single<LoginRes> {
        return apiRepository.login(loginReq = loginReq).observeOn(scheduler)
    }

    override fun logout(): Single<BaseRes> {
        return createLogoutSingle()
    }

    private fun createLogoutSingle(): Single<BaseRes> {
        return apiRepository.logout().observeOn(scheduler)
    }
}
