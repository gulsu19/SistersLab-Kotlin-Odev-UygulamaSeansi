package com.example.kotlinuygulama4hafta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinuygulama4hafta.databinding.ActivityOgrenciGirisBinding
import com.google.android.material.snackbar.Snackbar

class OgrenciGiris : AppCompatActivity() {
    private lateinit var binding:ActivityOgrenciGirisBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOgrenciGirisBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val editTextTC = binding.editTextTC
        val editTextAd = binding.editTextAd

        binding.button.setOnClickListener {
            if(editTextAd.text.isEmpty() || editTextTC.text.isEmpty()){
                Snackbar.make(it,"TC veya Şifrenizi girmediniz.Lütfen giriniz.",Snackbar.LENGTH_SHORT).show()
            }else{
                Snackbar.make(it,"Başarıyla giriş yaptınız.",Snackbar.LENGTH_SHORT).show()

            }
        }
    }
}