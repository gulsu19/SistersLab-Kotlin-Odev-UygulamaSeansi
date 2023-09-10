package com.example.kotlinodev2hafta.Soru2

import com.example.kotlinodev2hafta.Soru2.Oyuncu

class Futbolcu (isim:String,yas:Int,takim:String,val pozisyon:String) : Oyuncu(isim,yas,takim){
    override fun oyna() {
        println("$isim $pozisyon pozisyonunda oynuyor.")
    }
}