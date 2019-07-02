package com.huynn109.template.data.local

import android.content.Context
import com.huynn109.template.config.AUTH_DATA_HEADER_NAME

/**
 * Created by huynn109 on 2019-06-07.
 */
class SharePreferenceHelper(val androidContext: Context) {
    fun getAuthData(): String {
        return AUTH_DATA_HEADER_NAME // return AUTH_DATA_HEADER_NAME + token
    }
}