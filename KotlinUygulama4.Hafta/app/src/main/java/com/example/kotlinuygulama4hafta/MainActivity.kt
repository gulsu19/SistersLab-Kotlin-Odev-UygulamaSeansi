package com.example.kotlinuygulama4hafta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinuygulama4hafta.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.buttonYiyecek.setOnClickListener {
            val yeniIntent = Intent(this@MainActivity,yiyecekler::class.java)
            startActivity(yeniIntent)
        }

        tasarim.button3.setOnClickListener {
            val yeniIntent= Intent(this@MainActivity,icecekler::class.java)
            startActivity(yeniIntent)
        }


        }
    }
