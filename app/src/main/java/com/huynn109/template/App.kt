package com.huynn109.template

import androidx.multidex.MultiDexApplication
import com.huynn109.template.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

/**
 * Created by huynn109 on 2019-07-01.
 */

class App : MultiDexApplication() {
    override fun onCreate() {
        super.onCreate()
        setupTimber()
        setupKoin()
    }

    private fun setupTimber() {
        Timber.plant(Timber.DebugTree())
    }

    private fun setupKoin() {
        startKoin {
            androidContext(this@App)
            modules(
                listOf(
                    apiModule,
                    dataSourceModule,
                    networkModule,
                    repositoryModule,
                    useCaseModule,
                    viewModelModule
                )
            )
        }
    }
}