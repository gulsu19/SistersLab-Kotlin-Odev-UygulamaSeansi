package com.example.kotlinuygulama3hafta1.Soru4

fun main() {
    val liste = listOf(1, 2, 3, 4, 5,6,8,9,19)
    val reverseListe = reverseListe(liste)
    println(reverseListe)
}

fun reverseListe(liste: List<Int>): List<Int> {
    return liste.reversed()
}
