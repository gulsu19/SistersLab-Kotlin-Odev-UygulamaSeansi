package com.example.kotlinodev5hafta.hafta5.Soru1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.kotlinodev5hafta.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var nesnelerArrayList: ArrayList<Nesneler>
    private lateinit var adapter: NesnelerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rv.setHasFixedSize(true)
        binding.rv.layoutManager=StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.HORIZONTAL)

        val n1 = Nesneler("Şemsiye","semsiye")
        val n2 = Nesneler("Ufo","ufo")
        val n3 = Nesneler("Saat","saat")
        val n4 = Nesneler("Kitap","kitap")

        nesnelerArrayList = ArrayList<Nesneler>()

        nesnelerArrayList.add(n1)
        nesnelerArrayList.add(n2)
        nesnelerArrayList.add(n3)
        nesnelerArrayList.add(n4)

        adapter = NesnelerAdapter(this,nesnelerArrayList)
        binding.rv.adapter = adapter
    }
}