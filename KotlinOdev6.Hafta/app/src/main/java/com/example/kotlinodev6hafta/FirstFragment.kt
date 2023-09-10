package com.example.kotlinodev6hafta

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.kotlinodev6hafta.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater,container,false)

        binding.buttonSepet.setOnClickListener {
            view?.findNavController()?.navigate(R.id.activity_to_second_page,
                Bundle().apply {
                    putString("urunAdi",binding.textViewAd.text.toString())
                    putString("urunFiyat",binding.textViewFiyat.text.toString())
                })

        }

        return binding.root
    }

}