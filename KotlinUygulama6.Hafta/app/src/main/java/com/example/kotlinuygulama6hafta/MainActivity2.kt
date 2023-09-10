package com.example.kotlinuygulama6hafta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.kotlinuygulama6hafta.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding:ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.action_firstFragment_to_secondFragment) as NavHostFragment

        NavigationUI.setupWithNavController(binding.navView,navHostFragment.navController)

        binding.toolbar.title = "Kategoriler"

        val toggle = ActionBarDrawerToggle(this,binding.drawer,binding.toolbar,0,0)

        binding.drawer.addDrawerListener(toggle)
        toggle.syncState()
        

    }
}
