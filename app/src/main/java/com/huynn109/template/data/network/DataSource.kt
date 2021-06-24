package com.huynn109.template.data.network

import com.huynn109.template.data.model.req.LoginReq
import com.huynn109.template.data.model.res.BaseRes
import com.huynn109.template.data.model.res.LoginRes
import io.reactivex.Single


interface DataSource {
    fun login(loginReq: LoginReq): Single<LoginRes>
    fun logout(): Single<BaseRes>
}
