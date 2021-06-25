package com.huynn109.template.ui.main

import android.os.Bundle
import android.view.View
import com.huynn109.template.R
import com.huynn109.template.base.BaseActivity
import com.huynn109.template.databinding.ActivityMainBinding

/**
 * Created by huynn109 on 2019-07-01.
 */

class MainActivity : BaseActivity<MainViewModel>() {

    override val contentViewBinding: View
        get() {
            val binding = ActivityMainBinding.inflate(layoutInflater)
            return binding.root
        }

    private lateinit var binding: ActivityMainBinding

    override fun observerViewModel() {
    }

    override fun initUIComponent() {
    }
}
