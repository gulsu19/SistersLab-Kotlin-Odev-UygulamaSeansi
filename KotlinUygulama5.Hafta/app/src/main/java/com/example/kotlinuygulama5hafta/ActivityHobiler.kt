package com.example.kotlinuygulama5hafta

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.kotlinuygulama5hafta.databinding.ActivityHobilerBinding

class ActivityHobiler : AppCompatActivity() {
    private lateinit var binding: ActivityHobilerBinding
    private lateinit var adapter: HobilerAdapter
    private lateinit var hobilerArrayList: ArrayList<Hobiler>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityHobilerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rv.setHasFixedSize(true)
        binding.rv.layoutManager =StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL)

        val h1=Hobiler(1,"Koşma","images")
        val h2=Hobiler(2,"Yüzme","imagesss")
        val h3=Hobiler(3,"Fitness","img")

        hobilerArrayList=ArrayList<Hobiler>()

        hobilerArrayList.add(h1)
        hobilerArrayList.add(h2)
        hobilerArrayList.add(h3)

        adapter=HobilerAdapter(this,hobilerArrayList)
        binding.rv.adapter=adapter
    }
}