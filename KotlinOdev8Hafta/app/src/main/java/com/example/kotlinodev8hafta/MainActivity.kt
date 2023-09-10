package com.example.kotlinodev8hafta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.kotlinodev8hafta.databinding.ActivityMainBinding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var noteListe: ArrayList<Notes>
    private lateinit var adapter: NoteAdapter
    private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        noteListe = ArrayList()
        binding.rvNote.setHasFixedSize(true)
        val layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        binding.rvNote.layoutManager = layoutManager

        adapter = NoteAdapter(this, noteListe)
        binding.rvNote.adapter = adapter
        
        database = FirebaseDatabase.getInstance().reference.child("notes")

        database.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                noteListe.clear()
                for (noteSnapshot in dataSnapshot.children) {
                    val note = noteSnapshot.getValue(Notes::class.java)
                    note?.let {
                        noteListe.add(it)
                    }
                }
                adapter.notifyDataSetChanged()
            }

            override fun onCancelled(databaseError: DatabaseError) {
            }
        })

        binding.buttonAddNote.setOnClickListener {

            val yeniNot = Notes("2", "Yeni Not", "Bu yeni bir not")

            val newNoteRef = database.push()
            yeniNot.note_id = newNoteRef.key
            newNoteRef.setValue(yeniNot)

            noteListe.add(yeniNot)
            adapter.notifyDataSetChanged()
        }
    }
}