package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val btn:Button=findViewById(R.id.button_submit)
        btn.setOnClickListener({
            Toast.makeText(this,"submit button was clicked",Toast.LENGTH_SHORT).show()
        }

        )
    }
}