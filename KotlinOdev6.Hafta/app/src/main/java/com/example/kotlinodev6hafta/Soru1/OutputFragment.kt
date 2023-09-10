package com.example.kotlinodev6hafta.Soru1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kotlinodev6hafta.databinding.FragmentOutputBinding

class OutputFragment : Fragment() {
    private lateinit var binding:FragmentOutputBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOutputBinding.inflate(inflater,container,false)

        binding.textView2.text = arguments?.getString("Ad")
        binding.textView3.text = arguments?.getString("Soyad")

        return binding.root
    }

}