package com.huynn109.template.data.model.res

import com.google.gson.annotations.SerializedName

/**
 * Created by huynn109 on 2019-07-01.
 */
abstract class BaseRes(@SerializedName("status")
                            var code: Int? = -1,
                            @SerializedName("message")
                            var message: String? = null)
