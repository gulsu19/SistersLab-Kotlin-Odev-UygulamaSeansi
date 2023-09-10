package com.example.kotlinuygulama3hafta1.Soru15

import com.example.kotlinuygulama3hafta1.Soru15.GeometrikSekil

class Daire(val yaricap: Double): GeometrikSekil {
    override fun hesapla(): Double {
        return Math.PI * yaricap * yaricap
    }
}