package com.huynn109.template.ui.login

import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.huynn109.template.R
import com.huynn109.template.base.BaseActivity
import com.huynn109.template.databinding.ActivityLoginBinding
import com.huynn109.template.util.SafeOnClick
import com.huynn109.template.util.ext.onSafeClick
import timber.log.Timber

class LoginActivity : BaseActivity<LoginViewModel>() {
    override val contentViewBinding: View
        get() {
            binding = ActivityLoginBinding.inflate(layoutInflater)
            return binding.root
        }

    private lateinit var binding: ActivityLoginBinding

    override fun observerViewModel() {
    }

    override fun initUIComponent() {
    }

}
