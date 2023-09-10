package com.example.kotlinuygulama6hafta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kotlinuygulama6hafta.databinding.FragmentSepetBinding

class SepetFragment : Fragment() {
    private lateinit var binding: FragmentSepetBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSepetBinding.inflate(inflater,container,false)

        binding.textView4.text = arguments?.getString("urunAdi")
        binding.textView5.text = arguments?.getString("urunFiyat")

        return binding.root
    }

}