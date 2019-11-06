package com.mumayank.airloginviewsproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            Toast.makeText(this, airLoginViewsEmailView.emailET.text.toString(), Toast.LENGTH_SHORT).show()
        }

        button2.setOnClickListener {
            Toast.makeText(this, airLoginViewsPasswordView.passwordET.text.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}
