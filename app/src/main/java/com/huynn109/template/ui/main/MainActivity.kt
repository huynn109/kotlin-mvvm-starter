package com.huynn109.template.ui.main

import android.os.Bundle
import com.huynn109.template.R
import com.huynn109.template.base.BaseActivity

/**
 * Created by huynn109 on 2019-07-01.
 */

class MainActivity : BaseActivity<MainViewModel>() {

    override val layoutResId: Int
        get() = R.layout.activity_main

    override fun observerViewModel() {
    }

    override fun initUIComponent() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
