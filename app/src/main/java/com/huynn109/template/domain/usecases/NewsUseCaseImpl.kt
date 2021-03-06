package com.huynn109.template.domain.usecases

import com.huynn109.template.data.source.network.ApiRepository

/**
 * Created by huynn109 on 2019-07-01.
 */

interface NewsUseCase

class NewsUseCaseImpl(private val apiRepository: ApiRepository) : NewsUseCase
