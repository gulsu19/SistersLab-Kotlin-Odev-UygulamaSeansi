package com.example.kotlinuygulama3hafta1.Soru18

class EnBuyukSayi(val sayilar: Array<Int>):Thread() {
    var maxNumber: Int? = null

    override fun run() {
        maxNumber = sayilar.maxOrNull()
    }
}