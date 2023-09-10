package com.example.kotlinodev2hafta.Soru1

import com.example.kotlinodev2hafta.Soru1.GeometrikSekil
import kotlin.math.PI

class Daire (val yaricap: Double) : GeometrikSekil() {
    fun alanHesapla(): Double {
        return PI * yaricap * yaricap
    }

    fun cevreHesapla(): Double {
        return 2 * PI * yaricap
    }
}
