package com.github.muellerma.androidcommon.extensions

import android.content.Context
import android.widget.Toast
import androidx.annotation.StringRes

fun Context.showToast(@StringRes msg: Int, duration: Int = Toast.LENGTH_SHORT) {
    showToast(getString(msg), duration)
}

fun Context.showToast(msg: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast
        .makeText(this, msg, duration)
        .show()
}