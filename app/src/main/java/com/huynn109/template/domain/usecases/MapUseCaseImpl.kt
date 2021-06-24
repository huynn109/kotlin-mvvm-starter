package com.huynn109.template.domain

import com.huynn109.template.data.network.ApiRepository

/**
 * Created by huynn109 on 2019-07-01.
 */

interface MapUseCase

class MapUseCaseImpl(private val apiRepository: ApiRepository) : MapUseCase