package com.example.kotlinuygulama6hafta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.kotlinuygulama6hafta.databinding.FragmentDetayBinding

class DetayFragment : Fragment() {
    private lateinit var binding:FragmentDetayBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetayBinding.inflate(inflater,container,false)

        binding.button.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_sepete_gecis,
                Bundle().apply {
                    putString("urunAdi",binding.textView.text.toString())
                    putString("urunFiyat",binding.textView2.text.toString())
                })
                }

        return binding.root
    }

}