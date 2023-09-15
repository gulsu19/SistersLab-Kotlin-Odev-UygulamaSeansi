package com.example.kotlinodev9hafta.data

import com.google.firebase.database.IgnoreExtraProperties
import java.io.Serializable

@IgnoreExtraProperties
data class Kategoriler(var kategoriler_id:Int, var kategori_ad:String?=""): Serializable {
}