package com.example.firstprojectt.hafta1.odev2

import java.util.Scanner
import kotlin.Exception

fun main (){
    println("Yaşınızı girin:")
    val girdi = Scanner(System.`in`)
    if (girdi.hasNextInt()){
        try {
            var yas = girdi.nextInt()
            if (yas >= 18) {
                println("Oy kullanabilirsiniz.")
            }else if(yas < 0) {
                println("Yaş 0'dan küçük olamaz.")
            }else {
                println("Oy kullanamazsınız.")
            }
        } catch (e: Exception) {
            println("Geçerli bir yaş girmediniz.")
        }
    }else{
        println("Lütfen bir sayı giriniz.")
    }
}
