package com.example.kotlinodev2hafta.Soru1

import com.example.kotlinodev2hafta.Soru1.Daire
import com.example.kotlinodev2hafta.Soru1.Dikdortgen

fun main() {
    val dikdortgen = Dikdortgen(5.0, 3.0)
    val daire = Daire(4.0)

    println("Dikdörtgen Alan: ${dikdortgen.alanHesapla()}")
    println("Dikdörtgen Çevre: ${dikdortgen.cevreHesapla()}")

    println("Daire Alan: ${daire.alanHesapla()}")
    println("Daire Çevre: ${daire.cevreHesapla()}")
}
