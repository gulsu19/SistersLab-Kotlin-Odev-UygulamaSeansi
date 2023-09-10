package com.example.kotlinuygulama3hafta1.Soru18

import com.example.kotlinuygulama3hafta1.Soru18.EnBuyukSayi
import com.example.kotlinuygulama3hafta1.Soru18.EnKucukSayi

fun main() {
    val sayilar = arrayOf(5, 8, 3, 2, 9, 4, 1, 7, 6)

    val maxThread = EnBuyukSayi(sayilar)
    val minThread = EnKucukSayi(sayilar)
    maxThread.start()
    minThread.start()

    maxThread.join()
    minThread.join()

    println("En büyük sayı: ${maxThread.maxNumber}")
    println("En küçük sayı: ${minThread.minNumber}")

}