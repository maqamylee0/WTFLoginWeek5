package com.tech4dev.wtfloginweek5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
      private lateinit var phoneNumber : EditText
    private lateinit var button : Button
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
          phoneNumber = findViewById(R.id.phone)
        button = findViewById(R.id.imageButton2)
    }
}
