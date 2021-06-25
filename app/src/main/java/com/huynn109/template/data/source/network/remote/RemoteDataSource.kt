package com.huynn109.template.data.source.network.remote

import com.huynn109.template.data.model.req.LoginReq
import com.huynn109.template.data.model.res.BaseRes
import com.huynn109.template.data.model.res.LoginRes
import com.huynn109.template.data.source.network.DataSource
import io.reactivex.Scheduler
import io.reactivex.Single

/**
 * Created by huynn109 on 4/8/19.
 */

class RemoteDataSource(
    private val apiService: ApiService,
    private val scheduler: Scheduler
) : DataSource {
    override fun login(loginReq: LoginReq): Single<LoginRes> {
        return apiService.login(loginReq = loginReq).subscribeOn(scheduler)
    }

    override fun logout(): Single<BaseRes> {
        return apiService.logout().subscribeOn(scheduler)
    }

}
