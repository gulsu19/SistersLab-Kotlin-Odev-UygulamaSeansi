package com.example.kotlinuygulama3hafta1.Soru10

fun main() {

        val map1 = hashMapOf("A" to 1, "B" to 2, "C" to 3)
        val map2 = hashMapOf("B" to 4, "C" to 3, "D" to 5)

        val birlesim = map1.filterKeys { map2.containsKey(it) }

        println(birlesim)

}
