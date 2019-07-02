package com.huynn109.template.data.network

import com.huynn109.template.data.entity.req.LoginReq
import com.huynn109.template.data.entity.res.BaseRes
import com.huynn109.template.data.entity.res.LoginRes
import com.huynn109.template.data.network.remote.RemoteDataSource
import io.reactivex.Single


class ApiRepository(private val remoteDataSource: RemoteDataSource) : DataSource {
    override fun login(loginReq: LoginReq): Single<LoginRes> {
        return remoteDataSource.login(loginReq = loginReq)
    }

    override fun logout(): Single<BaseRes> {
        return remoteDataSource.logout()
    }
}