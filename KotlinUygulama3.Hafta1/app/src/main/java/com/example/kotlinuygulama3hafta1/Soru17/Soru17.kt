package com.example.kotlinuygulama3hafta1.Soru17

import kotlin.concurrent.thread
fun halfSum(numbers: Array<Int>, startIndex: Int, endIndex: Int): Int {
    var sum = 0
    for (i in startIndex until endIndex) {
        sum += numbers[i]
    }
    return sum
}

fun main() {

    val numbers = arrayOf(5, 8, 3, 2, 9, 4, 1, 7, 6)

    val midIndex = numbers.size / 2
    var firstHalfSum = 0
    var secondHalfSum = 0
    thread {
        firstHalfSum = halfSum(numbers, 0, midIndex)
    }.join()
    thread {
        secondHalfSum = halfSum(numbers, midIndex, numbers.size)
    }.join()

    println("İlk yarının toplamı: $firstHalfSum")
    println("İkinci yarının toplamı: $secondHalfSum")
    var totalSum= firstHalfSum + secondHalfSum
    println("Toplamı: $totalSum")

}
