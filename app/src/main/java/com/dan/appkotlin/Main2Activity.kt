package com.dan.appkotlin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*


class Main2Activity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val message = intent.getStringExtra("msg")
        val tv = TextView(this)
        tv.text = message
        val t2 = findViewById<TextView>(R.id.txt)
        t2.text = message
        goback.setOnClickListener {

            val i = Intent(this, MainActivity::class.java)
            startActivity(i)

            // your code to perform when the user clicks on the button
            Toast.makeText(this@Main2Activity, "Navigating to home.", Toast.LENGTH_SHORT).show()
        }
    }
}
