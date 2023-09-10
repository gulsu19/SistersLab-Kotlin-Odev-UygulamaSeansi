package com.example.kotlinodev8hafta

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageButton
import androidx.recyclerview.widget.RecyclerView

class NoteAdapter(private val mContext: Context, private val notesListe: MutableList<Notes>)
    : RecyclerView.Adapter<NoteAdapter.ViewHolder>() {

    inner class ViewHolder(tasarim: View) : RecyclerView.ViewHolder(tasarim) {
        var titleEditText: EditText
        var notesEditText: EditText
        var deleteButton: ImageButton
        var updateButton: ImageButton

        init {
            titleEditText = tasarim.findViewById(R.id.editTextTitle)
            notesEditText = tasarim.findViewById(R.id.editTextNotes)
            deleteButton = tasarim.findViewById(R.id.imageButtonDelete)
            updateButton = tasarim.findViewById(R.id.imageButtonUpdate)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.activity_notes, parent, false)
        return ViewHolder(tasarim)
    }

    override fun getItemCount(): Int {
        return notesListe.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val notes = notesListe[position]
        holder.titleEditText.setText(notes.note_title)
        holder.notesEditText.setText(notes.note_notes)

        holder.updateButton.setOnClickListener {
            val updatedTitle = holder.titleEditText.text.toString()
            val updatedNotes = holder.notesEditText.text.toString()
            val updatedNote = Notes(notes.note_id, updatedTitle, updatedNotes)
            notesListe[position] = updatedNote
            notifyDataSetChanged()
        }

        holder.deleteButton.setOnClickListener {
            notesListe.removeAt(position)
            notifyDataSetChanged()
        }

    }
}


