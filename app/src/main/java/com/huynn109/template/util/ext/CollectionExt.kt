package com.huynn109.template.util.ext

import java.util.ArrayList

/**
 * Created by huynn109 on 2019-06-19.
 */

fun <E> ArrayList<E>.clearAndAddAll(list: List<E>) {
    this.clear()
    this.addAll(list)
}