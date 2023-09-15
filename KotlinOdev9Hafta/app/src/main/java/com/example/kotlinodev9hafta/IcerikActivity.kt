package com.example.kotlinodev9hafta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinodev9hafta.data.Bilmece
import com.example.kotlinodev9hafta.data.Fikra
import com.example.kotlinodev9hafta.data.Masal
import com.example.kotlinodev9hafta.data.Tekerleme
import com.example.kotlinodev9hafta.databinding.ActivityIcerikBinding
import com.example.kotlinodev9hafta.view.IcerikViewModel
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener

class IcerikActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIcerikBinding
    private lateinit var viewModel: IcerikViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIcerikBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val database = Firebase.database.reference

        val masallarRef = database.child("masallar")
        masallarRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {

                val masallar = dataSnapshot.children.mapNotNull { it.getValue<Masal>() }
                IcerikViewModel.getMasallar(masallar)
            }

            override fun onCancelled(databaseError: DatabaseError) {
            }
        })

        val fikralarRef = database.child("fikralar")
        fikralarRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val fikralar = dataSnapshot.children.mapNotNull { it.getValue<Fikra>() }
                IcerikViewModel.getFikralar(fikralar)
            }

            override fun onCancelled(databaseError: DatabaseError) {
            }
        })

        val tekerlemelerRef = database.child("tekerlemeler")
        tekerlemelerRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val tekerlemeler = dataSnapshot.children.mapNotNull { it.getValue<Tekerleme>() }
                IcerikViewModel.getTekerlemeler(tekerlemeler)
            }

            override fun onCancelled(databaseError: DatabaseError) {

            }
        })

        val bilmecelerRef = database.child("bilmeceler")
        bilmecelerRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val bilmeceler = dataSnapshot.children.mapNotNull { it.getValue<Bilmece>() }
                IcerikViewModel.getBilmeceler(bilmeceler)
            }

            override fun onCancelled(databaseError: DatabaseError) {
            }
        })


    }
}
