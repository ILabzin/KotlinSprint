package org.example.lesson_1

fun main() {
    val year: Int = 1961
    var hour: String = "09"
    var minute: String = "07"


    println(year)
    println(hour)
    println(minute)

    hour = "10"
    minute = "55"

    val andTime = String.format("%s:%s", hour, minute)

    print(andTime)
}