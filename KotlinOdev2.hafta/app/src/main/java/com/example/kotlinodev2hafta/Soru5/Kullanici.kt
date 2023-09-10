package com.example.kotlinodev2hafta.Soru5

class Kullanici (val ad: String?, val soyad: String?) {
    fun kullaniciBilgileri() {
        if (ad != null && soyad != null) {
            println("Kullanıcı adı: $ad, Soyadı: $soyad")
        } else {
            println("Kullanıcı bilgileri mevcut değil.")
        }
    }
}