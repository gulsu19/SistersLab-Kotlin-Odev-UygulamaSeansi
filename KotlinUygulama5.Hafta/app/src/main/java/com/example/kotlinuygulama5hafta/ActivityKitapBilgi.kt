package com.example.kotlinuygulama5hafta

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinuygulama5hafta.databinding.ActivityKitapBilgiBinding

class ActivityKitapBilgi : AppCompatActivity() {
    private lateinit var binding: ActivityKitapBilgiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityKitapBilgiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val editTextKitapAd =binding.editTextKitapAd
        val editTextYazar = binding.editTextYazar

        binding.buttonGoster.setOnClickListener {

            val kitapAdi = editTextKitapAd.text.toString()
            val yazar =editTextYazar.text.toString()
            val newIntent = Intent(this@ActivityKitapBilgi,ActivityKitap::class.java)
            newIntent.putExtra("ad",kitapAdi)
            newIntent.putExtra("yazar",yazar)
            startActivity(newIntent)
        }
    }
}