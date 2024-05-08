package com.pvh.demolibmodule

import android.content.Context
import android.widget.Toast

class MyDemoLib {

    fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}