package com.dan.appkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.content.Intent
import android.text.TextUtils
import android.widget.EditText





class MainActivity : AppCompatActivity() {
    private var button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        // get reference to button
//       findViewById(R.id.btn_click_me) as Button
        val btn_click_me = findViewById<Button>(R.id.btn_click_me)
        // set on-click listener
        btn_click_me.setOnClickListener {
            val ed = findViewById<EditText>(R.id.input)
            val input = ed.getText().toString().trim()
            if (!TextUtils.isEmpty(input)) {
                val i = Intent(this, Main2Activity::class.java)
                i.putExtra("msg", input)
                i.putExtra("two", "Am not fine")
                startActivity(i)
                Toast.makeText(this@MainActivity, "Navigating to another Screen.", Toast.LENGTH_SHORT).show()


            }else{
                Toast.makeText(this@MainActivity, "You dont have a message written", Toast.LENGTH_SHORT).show()

            }

             }

    }
}
