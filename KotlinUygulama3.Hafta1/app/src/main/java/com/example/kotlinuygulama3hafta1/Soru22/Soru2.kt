package com.example.kotlinuygulama3hafta1.Soru22

fun main() {
    val sayilar = arrayOf(1,2,3,4,5,6,7,8,9,10)
    var enBuyuk=sayilar[0]
    var enKucuk=sayilar[0]

    //1.Yontem
    for(i in sayilar){
        if(i>enBuyuk){
            enBuyuk=i
        }
    }
    println("En büyük sayı: $enBuyuk")

    for(j in sayilar){
        if(j<enKucuk){
            enKucuk=j
        }
    }
    println("En küçük sayı: $enKucuk")

    //2.Yontem
    val enBuyuk2 = sayilar.maxOrNull()
    println("En büyük sayı: $enBuyuk2")
    val enKucuk2 = sayilar.minOrNull()
    println("En küçük sayı: $enKucuk2")

    //Bir "Calisan" (Employee) arayüzü oluşturun ve bu arayüzü uygulayan sınıfları (Mudur ve Memur) tanımlayın. Her sınıfın "maasHesapla" metodu olsun




}