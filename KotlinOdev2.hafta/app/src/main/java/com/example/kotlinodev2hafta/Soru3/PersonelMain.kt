package com.example.kotlinodev2hafta.Soru3

import com.example.kotlinodev2hafta.Soru3.Personel

fun main() {
    val personel1 = Personel("Gülsu", "Korkmaz", "Mühendis", 8000.0)
    val personel2 = Personel("Nurdan", "Kara", "Hukuk", 9000.0)

    println("Ad:${personel1.ad}")
    println("Soyad:${personel1.soyad}")
    println("Pozisyon: ${personel1.pozisyon}")
    println("Maaş: ${personel1.maas}")
    personel1.maasArttir(1000.0)
    println("-----------------------------------------------------------")
    println("Ad:${personel2.ad}")
    println("Soyad:${personel2.soyad}")
    println("Pozisyon: ${personel2.pozisyon}")
    println("Maaş: ${personel2.maas}")
    personel2.maasArttir(800.0)
}
