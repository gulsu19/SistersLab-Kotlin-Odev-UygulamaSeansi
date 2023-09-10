package com.example.kotlinuygulama3hafta1.Soru6

import java.util.Scanner

fun main() {
    val dizi = hashSetOf("elma", "armut", "çilek", "muz")
    val scanner = Scanner(System.`in`)
    print("Meyve adını giriniz:")
    val meyve = scanner.nextLine().toLowerCase()

    if (dizi.contains(meyve)) {
        println("$meyve, dizi içinde yer alıyor.")
    } else {
        println("$meyve, dizi içinde yer almıyor.")
    }
}
