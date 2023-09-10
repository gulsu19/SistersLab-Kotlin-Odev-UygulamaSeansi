package com.example.kotlinuygulamaseansi

import java.util.Scanner

fun main(){

    val girdi=Scanner(System.`in`)
    println("Sınav notunuzu giriniz.")
    var not = girdi.nextInt()

    if(not>70){
        println("Geçtiniz.")
    }else if(not<0){
        println("Geçerli bir not girmediniz.")
    }else{
        println("Kaldınız.")
    }
}
