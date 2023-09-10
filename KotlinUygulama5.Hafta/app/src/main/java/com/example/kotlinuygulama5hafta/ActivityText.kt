package com.example.kotlinuygulama5hafta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.kotlinuygulama5hafta.databinding.ActivityMainBinding
import com.example.kotlinuygulama5hafta.databinding.ActivityTextBinding

class ActivityText : AppCompatActivity() {
    private lateinit var binding: ActivityTextBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityTextBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val editText = binding.editTextText

        binding.button2.setOnClickListener {

            val inputData = editText.text.toString()
            val intent = Intent(this, ActivityShowText::class.java)
            intent.putExtra("data", inputData)
            startActivity(intent)

           /* val text2 =TextClass("Hoşgeldiniz")
            val yeniIntent = Intent(this@ActivityText,ActivityShowText::class.java)
            yeniIntent.putExtra("text",text2)
            startActivity(yeniIntent)

            */


        }
    }
}