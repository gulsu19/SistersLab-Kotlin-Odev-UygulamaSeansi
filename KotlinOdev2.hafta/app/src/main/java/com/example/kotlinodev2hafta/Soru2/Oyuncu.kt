package com.example.kotlinodev2hafta.Soru2

open class Oyuncu (val isim: String, val yas: Int, val takim: String) {
    fun bilgileriGoster() {
        println("$isim - $yas yaşında - $takim takımında")
    }

    open fun oyna() {
        println("$isim oynuyor.")
    }
}
