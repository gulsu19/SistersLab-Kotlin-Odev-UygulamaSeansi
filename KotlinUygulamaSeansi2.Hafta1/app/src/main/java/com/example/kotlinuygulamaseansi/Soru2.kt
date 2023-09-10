package com.example.kotlinuygulamaseansi

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    print("Bir sayı girin: ")
    val n = scanner.nextInt()

    fun factoriyel(n: Int): Int {
        return if (n == 0) {
            1
        } else {
            n * factoriyel(n - 1)
        }
    }

    val result = factoriyel(n)
    println("$n! = $result")

}
