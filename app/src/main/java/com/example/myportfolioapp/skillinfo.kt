package com.example.myportfolioapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class skillinfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skillinfo)

        val kot = findViewById<ImageView>(R.id.kotlin)
        kot.setOnClickListener(){
            val url="https://github.com/Maigwa164"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse(url)
            startActivity(intent)
        }
        val unit = findViewById<ImageView>(R.id.unity)
        unit.setOnClickListener(){
            val url="https://github.com/Maigwa164"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse(url)
            startActivity(intent)
        }
        val jav = findViewById<ImageView>(R.id.java)
        jav.setOnClickListener(){
            val url="https://github.com/Maigwa164"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse(url)
            startActivity(intent)
        }
        val mong = findViewById<ImageView>(R.id.mongo)
        mong.setOnClickListener(){
            val url="https://github.com/Maigwa164"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse(url)
            startActivity(intent)
        }

    }
}