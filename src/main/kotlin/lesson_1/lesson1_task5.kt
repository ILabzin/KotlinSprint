package org.example.lesson_1

const val minInHour: Int = 60
const val secInMin: Int = 60
const val secInHour: Int = 3600

fun main() {

    val allTime: Int = 6480
    val hours: Int = allTime / secInHour
    val minute: Int = (allTime % (hours * secInHour)) / minInHour
    val seconds: Int = allTime - hours * secInHour - minute * secInMin
    val info = String.format("0%d:%2d:0%d", hours, minute, seconds);
    println(info)
}