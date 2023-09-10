package com.example.kotlinuygulamaseansi

import java.util.Scanner

fun main() {

    val girdi=Scanner(System.`in`)
    print("Bir ay ismi girin: ")
    val ay = girdi.next()

    when (ay) {
        "aralık", "ocak", "şubat" -> println("$ay kış mevsimidir.")
        "mart", "nisan", "mayıs" -> println("$ay ilkbahar mevsimidir.")
        "haziran", "temmuz", "ağustos" -> println("$ay yaz mevsimidir.")
        "eylül", "ekim", "kasım" -> println("$ay sonbahar mevsimidir.")
        else -> println("Geçersiz ay ismi girdiniz.")
    }
}
