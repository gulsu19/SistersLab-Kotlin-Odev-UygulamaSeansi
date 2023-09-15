package com.example.kotlinodev9hafta.data

import com.google.firebase.database.IgnoreExtraProperties
import java.io.Serializable

@IgnoreExtraProperties
class Icerikler(var icerik_id:Int,
                var icerik_ad:String?="",
                var icerik_isim:String?="",
                var icerik_resim:String?="",
                var kategoriler: Kategoriler,
                var icerikDetay: IcerikDetay
) : Serializable {
}