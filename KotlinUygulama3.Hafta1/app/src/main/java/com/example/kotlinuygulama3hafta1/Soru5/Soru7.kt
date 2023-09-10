package com.example.kotlinuygulama3hafta1.Soru5

fun main() {
    val sayilar = listOf(1, 2, 3, 2, 4, 3, 5,5,6,7,8,9,8)
    val tekrarEden = tekrarEdenleriBul(sayilar)
    println("Dizi: $sayilar")
    println("Tekrar Edenler: $tekrarEden")
}

fun tekrarEdenleriBul(liste: List<Int>): HashSet<Int> {
    val dizi = hashSetOf<Int>()
    val tekrarEdenler = hashSetOf<Int>()
    for (i in liste) {
        if (!dizi.add(i)) {
            tekrarEdenler.add(i)
        }
    }
    return tekrarEdenler
}
