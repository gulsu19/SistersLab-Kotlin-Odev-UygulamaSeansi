package com.example.kotlinuygulama3hafta1.Soru16

fun main() {

        val mudur1 = Mudur("Gülsu Korkmaz", 9000.0)
        val memur1 = Memur("Zeynep Yılmaz", 8000.0)

        println("Müdür:${mudur1.name} -> Maaş: ${mudur1.maasHesapla()}")
        println("Memur:${memur1.name} -> Maaş: ${memur1.maasHesapla()}")


}