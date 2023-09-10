package com.example.kotlinodev2hafta.Soru3

class Personel (val ad: String, val soyad: String, val pozisyon: String, var maas: Double) {
    fun maasArttir(artisMiktari: Double) {
        maas += artisMiktari
        println("$ad $soyad isimli çalışanın yeni maaşı: $maas")
    }
}