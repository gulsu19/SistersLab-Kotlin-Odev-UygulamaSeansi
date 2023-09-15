package com.example.kotlinodev9hafta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinodev9hafta.adapter.IceriklerAdapter
import com.example.kotlinodev9hafta.databinding.ActivityMainBinding
import com.example.kotlinodev9hafta.view.IcerikViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: IceriklerAdapter
    private lateinit var viewModel: IcerikViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = IceriklerAdapter(emptyList())
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter

        viewModel =
            ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory(application)).get(
                IcerikViewModel::class.java
            )

        viewModel.masallarLiveData.observe(this) { masallar ->
            adapter.submitList(masallar)
        }

        viewModel.fikralarLiveData.observe(this) { fikralar ->
            adapter.submitList(fikralar)
        }

        viewModel.tekerlemelerLiveData.observe(this) { tekerlemeler ->
            adapter.submitList(tekerlemeler)
        }

        viewModel.bilmecelerLiveData.observe(this) { bilmeceler ->
            adapter.submitList(bilmeceler)
        }
    }
}

}