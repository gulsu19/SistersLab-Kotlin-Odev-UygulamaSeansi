package com.example.kotlinodev2hafta.Soru2

import com.example.kotlinodev2hafta.Soru2.Basketbolcu
import com.example.kotlinodev2hafta.Soru2.Futbolcu

fun main() {
    val futbolcu = Futbolcu("Burak", 25, "Beşiktaş", "forvet")
    futbolcu.bilgileriGoster()
    futbolcu.oyna()

    val basketbolcu = Basketbolcu("Berk", 23, "Fenerbahçe", 185)
    basketbolcu.bilgileriGoster()
    basketbolcu.oyna()
}
