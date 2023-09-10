package com.example.kotlinodev2hafta.Soru2

import com.example.kotlinodev2hafta.Soru2.Oyuncu

class Basketbolcu (isim: String, yas: Int, takim: String, val boy: Int): Oyuncu(isim, yas, takim){
    override fun oyna() {
        println("$isim $boy cm boyunda oynuyor.")
    }
}