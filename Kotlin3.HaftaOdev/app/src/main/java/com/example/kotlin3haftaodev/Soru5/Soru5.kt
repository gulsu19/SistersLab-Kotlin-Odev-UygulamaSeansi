package com.example.kotlin3haftaodev.Soru5

fun main() {
    val thread1 = Thread{
        println("Thread1 başladı")
        Thread.sleep(5000)
        println("Thread1 bitti.")
    }

    val thread2 = Thread{
        println("Thread2 başladı.")
        Thread.sleep(3000)
        println("Thread2 bitti.")
    }

    thread1.start()
    thread2.start()

    println("Ana thread aktif bir şekilde çalışıyor!")
    Thread.sleep(6000)
    println("Ana Thread bitti.")
}