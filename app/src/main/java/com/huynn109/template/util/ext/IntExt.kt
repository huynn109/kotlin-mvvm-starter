package com.huynn109.template.util.ext

fun Int?.isSuccess() = if (this == null) false else this == 1

fun Int?.isError() = this != 1