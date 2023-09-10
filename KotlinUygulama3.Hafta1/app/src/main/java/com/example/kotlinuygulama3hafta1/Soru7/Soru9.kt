package com.example.kotlinuygulama3hafta1.Soru7

fun main() {
    val dizi1 = hashSetOf("fatma", "gülsu", "nurdan", "begüm", "nursel")
    val dizi2 = hashSetOf<String>()

    elemanlarıEkle(dizi1, dizi2)

    println("set1: $dizi1")
    println("set2: $dizi2")
}

fun elemanlarıEkle(dizi1: HashSet<String>, dizi2: HashSet<String>) {
    dizi2.addAll(dizi1)
}
