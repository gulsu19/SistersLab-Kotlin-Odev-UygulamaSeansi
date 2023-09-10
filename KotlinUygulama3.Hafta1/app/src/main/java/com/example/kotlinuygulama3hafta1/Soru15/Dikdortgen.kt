package com.example.kotlinuygulama3hafta1.Soru15

import com.example.kotlinuygulama3hafta1.Soru15.GeometrikSekil

class Dikdortgen(val genislik: Double, val uzunluk: Double): GeometrikSekil {
    override fun hesapla(): Double {
        return genislik * uzunluk
    }
}