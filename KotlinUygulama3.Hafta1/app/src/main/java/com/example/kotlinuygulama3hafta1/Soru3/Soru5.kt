package com.example.kotlinuygulama3hafta1.Soru3

fun main() {
    val list1 = listOf(7, 2, 3,0)
    val list2 = listOf(1, 8, 6,1)
    val birlesmisListe = birlestirSırala(list1, list2)
    println("Listenin birleştirilmiş ve sıralanmış hali $birlesmisListe")
}

fun birlestirSırala(liste1: List<Int>, liste2: List<Int>): List<Int> {
    val siralanmisListe = liste1 + liste2
    return siralanmisListe.sorted()
}
