package com.example.kotlinodev8hafta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.kotlinodev8hafta.databinding.ActivityNotesBinding

class NotesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNotesBinding
    private lateinit var noteListe: ArrayList<Notes>
    private lateinit var adapter: NoteAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNotesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}