package com.huynn109.template.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.huynn109.template.data.entity.res.BaseRes
import com.huynn109.template.util.Event
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

/**
 * Created by huynn109 on 2019-05-22.
 */

abstract class BaseViewModel : ViewModel(){
    private val compositeDisposable = CompositeDisposable()
    val eventLoading = MutableLiveData<Event<Boolean>>()
    val eventError = MutableLiveData<Event<BaseRes>>()
    val eventFailure = MutableLiveData<Event<Throwable>>()

    fun addDisposable(disposable: Disposable) {
        compositeDisposable.add(disposable)
    }

    override fun onCleared() {
        compositeDisposable.clear()
        super.onCleared()
    }

    fun showLoading(value: Boolean) {
        eventLoading.value = Event(value)
    }

    fun showError(baseRes: BaseRes) {
        eventError.value = Event(baseRes)
    }

    fun showFailure(throwable: Throwable) {
        eventFailure.value = Event(throwable)
    }
}