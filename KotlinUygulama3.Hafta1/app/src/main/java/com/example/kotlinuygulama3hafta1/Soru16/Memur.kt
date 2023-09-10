package com.example.kotlinuygulama3hafta1.Soru16

class Memur(val name: String, val salary: Double): Employee {
    override fun maasHesapla(): Double {
        return salary * 1.1
    }
}