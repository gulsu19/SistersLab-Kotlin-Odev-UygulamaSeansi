package com.example.kotlinodev8hafta

import com.google.firebase.database.IgnoreExtraProperties
import java.io.Serializable

@IgnoreExtraProperties
data class Notes(var note_id:String?="",
                 var note_title:String?="",
                 var note_notes:String?="") {
}