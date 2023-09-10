package com.example.kotlinodev6hafta.Soru1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.kotlinodev6hafta.R
import com.example.kotlinodev6hafta.databinding.FragmentAnaSayfaBinding

class AnaSayfaFragment : Fragment() {
    private lateinit var binding:FragmentAnaSayfaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnaSayfaBinding.inflate(inflater,container,false)

        binding.buttonGiris.setOnClickListener {
            view?.findNavController()?.navigate(
                R.id.action_output_gecis,
                Bundle().apply {
                    putString("Ad",binding.editTextAd.text.toString())
                    putString("Soyad",binding.editTextSoyad.text.toString())
                })

        }

        return binding.root
    }

}