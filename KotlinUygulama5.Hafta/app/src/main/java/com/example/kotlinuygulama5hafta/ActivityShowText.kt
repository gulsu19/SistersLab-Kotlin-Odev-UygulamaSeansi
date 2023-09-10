package com.example.kotlinuygulama5hafta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinuygulama5hafta.databinding.ActivityShowTextBinding

class ActivityShowText : AppCompatActivity() {
    private lateinit var binding: ActivityShowTextBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShowTextBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val textView = binding.textView2

        val receivedData = intent.getStringExtra("data")
        textView.text = receivedData
    }
}