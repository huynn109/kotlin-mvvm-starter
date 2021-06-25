package com.huynn109.template.domain.usecases

import com.huynn109.template.data.model.req.LoginReq
import com.huynn109.template.data.model.res.BaseRes
import com.huynn109.template.data.model.res.LoginRes
import com.huynn109.template.data.source.network.ApiRepository
import io.reactivex.Single

/**
 * Created by huynn109 on 2019-07-01.
 */

interface AccountUseCase{
    fun login(loginReq: LoginReq): Single<LoginRes>
    fun logout(): Single<BaseRes>
}

class AccountUseCaseImpl(private val apiRepository: ApiRepository) : AccountUseCase {
    override fun login(loginReq: LoginReq): Single<LoginRes> {
        return apiRepository.login(loginReq = loginReq)
    }

    override fun logout(): Single<BaseRes> {
        return apiRepository.logout()
    }

}
