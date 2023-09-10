package com.example.kotlinuygulama5hafta

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinuygulama5hafta.databinding.ActivityKitapBinding

class ActivityKitap : AppCompatActivity() {
    private lateinit var binding: ActivityKitapBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityKitapBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val textKitapAdi = binding.textViewAdi
        val textYazari = binding.textViewYazari

        val gelenKitapAdi=intent.getStringExtra("ad")
        textKitapAdi.text=gelenKitapAdi

        val gelenYazar= intent.getStringExtra("yazar")
        textYazari.text=gelenYazar
    }
}