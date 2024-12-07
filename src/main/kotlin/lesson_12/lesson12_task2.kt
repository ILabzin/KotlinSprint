package org.example.lesson_12

class Day2(
    var dayTemperature: Int,
    var nightTemperature: Int,
    var precipitation: Boolean,
) {
    fun printDay() {
        println(
            """
            Температура днем: $dayTemperature
            Температура ночью: $nightTemperature
            Осадки: $precipitation
        """.trimIndent()
        )
    }
}

fun main() {
    val day1 = Day2(12, 11, true)

    day1.printDay()
}