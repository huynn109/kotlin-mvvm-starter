package com.huynn109.template.base

import android.app.Activity
import android.content.Context
import android.content.Intent

/**
 * Created by huynn109 on 2019-05-22.
 */

interface ActivityArgs {
    fun intent(activity: Context): Intent
    fun launch(activity: Context) = activity.startActivity(intent(activity))
    fun launch(activity: Activity, requestCode: Int) = activity.startActivityForResult(intent(activity), requestCode)
}