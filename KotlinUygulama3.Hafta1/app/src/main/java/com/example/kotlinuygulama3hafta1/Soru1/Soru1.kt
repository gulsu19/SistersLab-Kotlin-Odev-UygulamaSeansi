package com.example.kotlinuygulama3hafta1.Soru1

fun main() {
    val sayilar = ArrayList<Int>()
    sayilar.add(1)
    sayilar.add(2)

    println("Toplamı : ${topla(sayilar)}")

}
fun topla(sayilar:List<Int>):Int{
    var sonuc=0
     for (i in sayilar){
        sonuc+=i
         println(sonuc)

     }
    return sonuc
}