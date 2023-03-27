package com.example.myportfolioapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonper = findViewById<Button>(R.id.personal)
        buttonper.setOnClickListener()
        {
            val intent = Intent(this,personalinfo::class.java)
            startActivity(intent)

        }

        val buttonedu = findViewById<Button>(R.id.education)
        buttonedu.setOnClickListener()
        {
            val intent = Intent(this,educationinfo::class.java)
            startActivity(intent)

        }
        val buttonexp = findViewById<Button>(R.id.experience)
        buttonexp.setOnClickListener()
        {
            val intent = Intent(this,experience::class.java)
            startActivity(intent)

        }
        val buttonskl = findViewById<Button>(R.id.skills)
        buttonskl.setOnClickListener()
        {
            val intent = Intent(this,skillinfo::class.java)
            startActivity(intent)

        }
        val buttonref = findViewById<Button>(R.id.referees)
        buttonref.setOnClickListener()
        {
            val intent = Intent(this,referenceinfo::class.java)
            startActivity(intent)

        }
    }




}