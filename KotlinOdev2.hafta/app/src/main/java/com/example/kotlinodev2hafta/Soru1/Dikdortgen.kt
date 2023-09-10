package com.example.kotlinodev2hafta.Soru1

import com.example.kotlinodev2hafta.Soru1.GeometrikSekil

class Dikdortgen (val uzunluk: Double,val genislik: Double) : GeometrikSekil(){
    fun alanHesapla(): Double {
        return uzunluk * genislik
    }

    fun cevreHesapla(): Double {
        return 2 * (uzunluk + genislik)
    }
}