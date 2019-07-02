package com.huynn109.template.data.network.remote

import com.huynn109.template.data.entity.req.LoginReq
import com.huynn109.template.data.entity.res.BaseRes
import com.huynn109.template.data.entity.res.LoginRes
import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST


interface ApiService {
    @POST("login")
    fun login(@Body loginReq: LoginReq): Single<LoginRes>

    @GET("logout")
    fun logout(): Single<BaseRes>
}