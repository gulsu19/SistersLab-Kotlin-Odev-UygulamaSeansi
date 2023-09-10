package com.example.kotlinodev5hafta.hafta5.Soru1

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinodev5hafta.databinding.CardNesneDesignBinding

class NesnelerAdapter(private val mContext:Context, private val nesnelerListesi:List<Nesneler>):RecyclerView.Adapter<NesnelerAdapter.CardDesignTutucu>() {

    inner class CardDesignTutucu(val binding: CardNesneDesignBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignTutucu {
        val binding=CardNesneDesignBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CardDesignTutucu(binding)
    }

    override fun getItemCount(): Int {
        return nesnelerListesi.size
    }

    override fun onBindViewHolder(holder: CardDesignTutucu, position: Int) {
        val nesne = nesnelerListesi[position]

        val binding = holder.binding

        binding.textView2.text = nesne.nesne_ad

        val resim_id = mContext.resources.getIdentifier(nesne.nesne_id,"drawable",mContext.packageName)
        binding.imageView2.setImageResource(resim_id)
    }

}