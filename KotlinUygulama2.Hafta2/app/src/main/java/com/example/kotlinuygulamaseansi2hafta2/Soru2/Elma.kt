package com.example.kotlinuygulamaseansi2hafta2.Soru2

class Elma(ad: String, tatli: String, val vitaminDegeri: Int,val renk:String) : Meyve(ad, tatli) {
    fun yiyebilir() {
        println("$ad yenebilir.")
    }
}