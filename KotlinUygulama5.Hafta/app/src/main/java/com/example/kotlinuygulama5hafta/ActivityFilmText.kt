package com.example.kotlinuygulama5hafta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinuygulama5hafta.databinding.ActivityFilmTextBinding

class ActivityFilmText : AppCompatActivity() {
    private lateinit var binding: ActivityFilmTextBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityFilmTextBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val editTextFilmAdi =binding.editTextFilmAdi
        val editTextYonetmen=binding.editTextYonetmen
        val editTextPuan =binding.editTextPuan

        binding.button3.setOnClickListener {
            val inputFilmAdi= editTextFilmAdi.text.toString()
            val inputYonetmen = editTextYonetmen.text.toString()
            val inputPuan = editTextPuan.text.toString()
            val newIntent = Intent(this@ActivityFilmText,ActivityFilmlerMain::class.java)
            intent.putExtra("data",inputFilmAdi)
            intent.putExtra("data1",inputYonetmen)
            intent.putExtra("data2",inputPuan)
            startActivity(intent)
        }
    }
}