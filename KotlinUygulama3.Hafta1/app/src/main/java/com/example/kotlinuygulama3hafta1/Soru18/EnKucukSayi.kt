package com.example.kotlinuygulama3hafta1.Soru18

class EnKucukSayi(val sayilar: Array<Int>):Thread() {
    var minNumber: Int? = null

    override fun run() {
        minNumber = sayilar.minOrNull()
    }
}