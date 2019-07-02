package com.huynn109.template.util.ext

import androidx.lifecycle.MutableLiveData


/**
 * Created by huynn109 on 2019-06-18.
 */

fun <T> MutableLiveData<T>.notifyObserver() {
    this.value = this.value
}
