package com.huynn109.template.data.source.network

import com.huynn109.template.data.model.req.LoginReq
import com.huynn109.template.data.model.res.BaseRes
import com.huynn109.template.data.model.res.LoginRes
import com.huynn109.template.data.source.network.remote.RemoteDataSource
import io.reactivex.Single

class ApiRepository(private val remoteDataSource: RemoteDataSource) : DataSource {
    override fun login(loginReq: LoginReq): Single<LoginRes> {
        return remoteDataSource.login(loginReq = loginReq)
    }

    override fun logout(): Single<BaseRes> {
        return remoteDataSource.logout()
    }
}
