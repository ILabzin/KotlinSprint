package org.example.lesson_8

fun main() {

    val advertising: IntArray = intArrayOf(15, 36, 55, 32, 16, 64, 34)
    var summaryAdvertising = 0

    for (i in advertising) {
        summaryAdvertising += i
    }

    println(summaryAdvertising)

}