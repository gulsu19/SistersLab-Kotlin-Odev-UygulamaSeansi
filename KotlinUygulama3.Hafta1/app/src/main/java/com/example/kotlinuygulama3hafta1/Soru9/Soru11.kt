package com.example.kotlinuygulama3hafta1.Soru9

fun main() {
    val dizi1 = setOf(1, 2, 3, 4, 5)
    val dizi2 = setOf(4, 5, 6, 7, 8)

    val sonuc = setCikar(dizi1, dizi2)

    println("Dizi1: $dizi1")
    println("Dizi2: $dizi2")
    println("Sonuç: $sonuc")
}

fun setCikar(dizi1: Set<Int>, dizi2: Set<Int>): Set<Int> {
    return dizi1.minus(dizi2)
}
