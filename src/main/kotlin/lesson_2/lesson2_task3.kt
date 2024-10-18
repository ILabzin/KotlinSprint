package org.example.lesson_2

const val minInHour = 60

fun main() {

    val hour = 9
    val minute = 39
    val time = 457

    val allMinuteStart = (hour * minInHour) + minute
    val allMinuteEnd = allMinuteStart + time

    val hourEnd = allMinuteEnd / minInHour
    val minuteEnd = (allMinuteEnd % minInHour)

    println(String.format("%d:%d", hourEnd, minuteEnd))

}