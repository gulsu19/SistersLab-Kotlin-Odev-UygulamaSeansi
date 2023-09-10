package com.example.kotlinuygulama5hafta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinuygulama5hafta.databinding.ActivityFilmlerMainBinding

class ActivityFilmlerMain : AppCompatActivity() {
    private lateinit var binding: ActivityFilmlerMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityFilmlerMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val textKitapAdi = binding.textView3
        val textYonetmen =binding.textView5
        val textPuan =binding.textView6

        val outputKitapAdi = intent.getStringExtra("data")
        textKitapAdi.text=outputKitapAdi
        val outputYonetmen =intent.getStringExtra("data1")
        textYonetmen.text=outputYonetmen
        val outputPuan =intent.getStringExtra("data2")
        textPuan.text=outputPuan


    }
}