package com.example.kotlinuygulama3hafta1.Soru8

fun main() {
    val meyveler = listOf("elma", "armut", "çilek", "muz", "elma", "muz")
    val dizi = listeDondur(meyveler)

    println("Diziler: $meyveler")
    println("Tekrar etmeyen SetOf: $dizi")
}

fun listeDondur(dizi: List<String>): Set<String> {
    return dizi.toSet()
}
