package org.example.lesson_1

const val minInHour: Int = 60
const val secInMin: Int = 60
const val secInHour: Int = 3600

fun main() {

    val seconds: Int = 6480
    val hours: Int = seconds / secInHour
    val minute: Int = (seconds % (hours * secInHour)) / minInHour
    val sec: Int = seconds - hours * secInHour - minute * secInMin
    val info = String.format("0%d:%2d:0%d", hours, minute, sec);
    println(info)
}