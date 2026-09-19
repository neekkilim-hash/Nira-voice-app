package com.neekkili.nira

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this)
        tv.text = "Hello Nira 👋"
        tv.textSize = 28f
        tv.setTextColor(Color.parseColor("#4FD8FF"))
        tv.setBackgroundColor(Color.parseColor("#050B14"))
        tv.gravity = Gravity.CENTER
        setContentView(tv)
    }
}
