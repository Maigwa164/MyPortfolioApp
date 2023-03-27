package com.example.myportfolioapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class personalinfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personalinfo)

        val insta = findViewById<ImageView>(R.id.gmail)
        insta.setOnClickListener(){
            val url="https://mailto:davidmaigwa164@gmail.com"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse(url)
            startActivity(intent)
        }

    }


}