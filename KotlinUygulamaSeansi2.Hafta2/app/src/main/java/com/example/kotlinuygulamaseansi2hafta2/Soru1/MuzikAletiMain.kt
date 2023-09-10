package com.example.kotlinuygulamaseansi2hafta2.Soru1

fun main(){
    val gitar = Gitar()
    val piyano = Piyano()

    val muzikDersi = MuzikDersi()

    muzikDersi.sesCikar(gitar)
    muzikDersi.sesCikar(piyano)
}