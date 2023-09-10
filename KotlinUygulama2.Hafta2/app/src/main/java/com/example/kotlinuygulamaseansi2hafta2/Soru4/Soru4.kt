package com.example.kotlinuygulamaseansi2hafta2.Soru4

import java.util.Scanner

fun main() {
    val sayilar = ArrayList<Int>()

    for (i in 1..5) {
        val girdi = Scanner(System.`in`)
        print("$i. sayiyi giriniz: ")
        val sayi= girdi.nextInt()
        sayilar.add(sayi)
    }

    val toplam = topla(sayilar)

    println("Girilen sayilarin toplami: $toplam")
}

fun topla(sayilar: ArrayList<Int>): Int {
    var toplam = 0

    for (sayi in sayilar) {
        toplam += sayi
    }

    return toplam
}
