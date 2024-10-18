package org.example.lesson_1

fun main() {
    val year: Int = 1961
    var hour: Int = 9
    var minute: Int = 7

    val realHour = String.format("0%d", hour)
    val realMinute = String.format("0%d", minute)

    println(year)
    println(realHour)
    println(realMinute)

    hour = 10
    minute = 55

    val andTime = String.format("%d:%d", hour, minute)

    print(andTime)
}