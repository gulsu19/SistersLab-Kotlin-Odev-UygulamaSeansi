package com.example.kotlinuygulama3hafta1.Soru15

import com.example.kotlinuygulama3hafta1.Soru15.Daire
import com.example.kotlinuygulama3hafta1.Soru15.Dikdortgen

fun main() {
    val dikdortgen= Dikdortgen(10.0,5.0)
    val daire= Daire(2.0)

    dikdortgen.hesapla()
    daire.hesapla()
    println("Dikdörtgen Alanı: ${dikdortgen.hesapla()}")
    println("Daire Alanı: ${daire.hesapla()}")
}