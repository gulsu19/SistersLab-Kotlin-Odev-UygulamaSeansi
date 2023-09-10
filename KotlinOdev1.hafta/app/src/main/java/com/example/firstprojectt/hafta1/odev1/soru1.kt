package com.example.firstprojectt.hafta1.odev1

import java.util.Scanner

fun main (){
    val scanner = Scanner(System.`in`)
    println("Kullanıcı adını giriniz:")
    val kullaniciAdi = scanner.nextLine()
    println("Şifre giriniz:")
    val sifre = scanner.nextLine()
    if(kullaniciAdi.equals("Gülsu",ignoreCase = true) &&sifre.equals("1910G",ignoreCase = false)){
        println("Hoşgeldiniz $kullaniciAdi")
    }else{
        println("Böyle bir kullanıcı bulunmamaktadır.")
    }
}
