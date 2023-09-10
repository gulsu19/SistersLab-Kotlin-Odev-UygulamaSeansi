package com.example.kotlinuygulamaseansi

fun main(){

    val ogr1 = Soru5.Ogrenci("Gülsu","Korkmaz","4")
    val ogr2 =Soru5.Ogrenci("Nazlı","Yılmaz","5")
    val ogr3 =Soru5.Ogrenci("Zeynep","Altunbaş","6")
    val ogr4 = Soru5.Ogrenci("Gülşah","Sağol","7")
    val ogr5 = Soru5.Ogrenci("Batu","Kara","8")

    ogrenciYazdir(ogr1)
    ogrenciYazdir(ogr2)
    ogrenciYazdir(ogr3)
    ogrenciYazdir(ogr4)
    ogrenciYazdir(ogr5)

}

fun ogrenciYazdir(ogr: Soru5.Ogrenci) {
    println("Ad: ${ogr.ad}")
    println("Soyad: ${ogr.soyad}")
    println("Sinif: ${ogr.sinif}")
}
