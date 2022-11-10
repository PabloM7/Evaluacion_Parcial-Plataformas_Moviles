package com.example.evaluacionparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_1=findViewById<Button>(R.id.button)
        btn_1.setOnClickListener{
            val saltar: Intent = Intent(this, Ventana2::class.java)
            startActivity(saltar)
        }
    }
}