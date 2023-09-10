package com.example.kotlinuygulama3hafta1.Soru2

fun main() {
    val sayilar = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val tekSayilar = tekSayilarıBul(sayilar)

    println("Sayılar: ${sayilar.contentToString()}")
    println("Tek Sayılar: ${tekSayilar.contentToString()}")
}

fun tekSayilarıBul(dizi: Array<Int>): Array<Int> {
    return dizi.filter { it % 2 != 0 }.toTypedArray()
}

