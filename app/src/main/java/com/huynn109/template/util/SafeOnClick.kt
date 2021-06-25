package com.huynn109.template.util

import android.view.View
import androidx.core.view.postDelayed

class SafeOnClick(
    private val interval: Long,
    private val doClick: ((View) -> Unit)
) : View.OnClickListener {
    private var enable = true

    override fun onClick(view: View) {
        if (enable) {
            enable = false
            view.postDelayed(interval) {
                enable = true
            }
            doClick(view)
        }
    }
}
