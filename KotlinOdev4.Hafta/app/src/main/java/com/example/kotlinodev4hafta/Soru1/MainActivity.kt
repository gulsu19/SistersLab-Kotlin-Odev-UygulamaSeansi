package com.example.kotlinodev4hafta.Soru1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinodev4hafta.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val editTextAd = binding.editTextAd
        val editTextNo = binding.editTextNo

        binding.button.setOnClickListener {
            if(editTextAd.text.isEmpty() || editTextNo.text.isEmpty()){
                Snackbar.make(it,"Lütfen boş alanları doldurunuz.",Snackbar.LENGTH_SHORT).show()
            }else{
                val yeniIntent = Intent(this@MainActivity, ActivityKayit::class.java)
                startActivity(yeniIntent)
            }

        }
    }
}