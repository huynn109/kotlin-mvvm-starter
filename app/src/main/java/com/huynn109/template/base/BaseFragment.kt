package com.huynn109.template.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.huynn109.template.util.ext.inflateLayout

/**
 * Created by huynn109 on 4/8/19.
 */

abstract class BaseFragment: Fragment(){

  abstract fun layoutId(): Int

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
    context?.inflateLayout(layoutId(),container,false)

  open fun onBackPressed() {}

  internal fun firstTimeCreated(savedInstanceState: Bundle?) = savedInstanceState == null
}