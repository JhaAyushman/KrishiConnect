package com.example.krishiconnect1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainscreen)
//        val button1 = findViewById<Button>(R.id.signup)
        val button2 = findViewById<Button>(R.id.login)

        button2.setOnClickListener {
            val intent = Intent(this, FarmersScreen::class.java)
            startActivity(intent)
        }
    }
}