package com.example.kotlinuygulama5hafta

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinuygulama5hafta.databinding.CardDesignBinding

class HobilerAdapter(private val mContext:Context, private val hobilerListe:List<Hobiler>):RecyclerView.Adapter<HobilerAdapter.CardTasarim>(){

    inner class CardTasarim(val binding: CardDesignBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarim {
        val binding =CardDesignBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CardTasarim(binding)
    }

    override fun getItemCount(): Int {
        return hobilerListe.size
    }

    override fun onBindViewHolder(holder: CardTasarim, position: Int) {
        val hobi = hobilerListe[position]

        val binding = holder.binding

        binding.textView4.text=hobi.spor_name

        val resim_id = mContext.resources.getIdentifier(hobi.resim_adi,"images",mContext.packageName)
        binding.imageView3.setImageResource(R.drawable.images)
    }


}