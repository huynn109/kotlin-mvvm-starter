package com.huynn109.template.base

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding
import com.huynn109.template.R
import com.huynn109.template.databinding.ActivityLoginBinding
import org.koin.android.viewmodel.ext.android.getViewModel
import java.lang.reflect.ParameterizedType
import kotlin.reflect.KClass


/**
 * Created by huynn109 on 2019-05-21.
 */

abstract class BaseActivity<out M : ViewModel> : AppCompatActivity() {

    val viewModel: M by lazy { getViewModel(clazz = getViewModelClass()) }

    @Suppress("UNCHECKED_CAST")
    private fun getViewModelClass(): KClass<M> {
        val type =
            (javaClass.genericSuperclass as ParameterizedType).actualTypeArguments[0] // index of 0 means first argument of BaseActivity class param
        return type as KClass<M>
    }

    abstract val contentViewBinding: View

    abstract fun observerViewModel()

    abstract fun initUIComponent()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(contentViewBinding)
        observerViewModel()
        initUIComponent()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    fun setupToolbar(toolbar: Toolbar, title: Int? = R.string.app_name) {
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            title?.let { setTitle(it) }
        }
    }

}
