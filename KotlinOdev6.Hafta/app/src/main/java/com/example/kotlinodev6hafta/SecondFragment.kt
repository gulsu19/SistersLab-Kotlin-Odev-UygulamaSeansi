package com.example.kotlinodev6hafta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.kotlinodev6hafta.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater,container,false)

        binding.textView4.text = arguments?.getString("urunAdi")
        binding.textView5.text = arguments?.getString("urunFiyat")

        binding.buttonSatNAl.setOnClickListener {
        Navigation.findNavController(it).navigate(R.id.activity_to_last_page)
        }

        return binding.root
    }

}