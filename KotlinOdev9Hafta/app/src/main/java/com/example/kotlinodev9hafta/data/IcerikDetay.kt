package com.example.kotlinodev9hafta.data

import com.google.firebase.database.IgnoreExtraProperties
import java.io.Serializable

@IgnoreExtraProperties
data class IcerikDetay(var icerik_detay_id:Int, var icerik_detay:String?=""): Serializable {
}