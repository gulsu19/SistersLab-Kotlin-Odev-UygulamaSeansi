package com.example.kotlinodev2hafta.Soru5

import com.example.kotlinodev2hafta.Soru5.Kullanici

fun main() {
    val user1 = Kullanici("Ahmet", "Yılmaz")
    user1.kullaniciBilgileri()

    val user2 = Kullanici(null, null)
    user2.kullaniciBilgileri()

    val user3 = Kullanici("Deniz",null)
    user3.kullaniciBilgileri()
}
