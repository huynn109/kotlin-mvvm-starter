package com.huynn109.template.util.ext

import android.content.res.Resources
import android.util.DisplayMetrics
import androidx.annotation.Dimension

// Created by huynn109 on 4/18/2019.

var displayMetrics: DisplayMetrics = Resources.getSystem().displayMetrics
/**
 * Converts the `dp` value to pixels dimension.
 *
 * @return the converted `dp` value to integer pixels
 */
val Int.dpToPx: Int
  @Dimension(unit = Dimension.PX) get() = (this * displayMetrics.density).toInt()