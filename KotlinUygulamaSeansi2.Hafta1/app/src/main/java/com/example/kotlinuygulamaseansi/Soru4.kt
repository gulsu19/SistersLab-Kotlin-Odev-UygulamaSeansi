package com.example.kotlinuygulamaseansi

import java.util.Scanner

fun main() {
    print("Lütfen bir harf girin: ")
    val harf = readLine()?.toLowerCase() ?: ""

    if (harf.isEmpty() || !harf[0].isLetter()) {
        println("Lütfen geçerli bir harf girin.")
    } else if (harf[0] in "aeiouıüö") {
        println("$harf bir sesli harftir.")
    } else {
        println("$harf bir sessiz harftir.")
    }
}
