package org.example.lesson_12

class Day() {
    var dayTemperature: Int = 12
    var nightTemperature: Int = 11
    var precipitation: Boolean = false
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
    val day1 = Day()
    day1.dayTemperature = 18
    day1.nightTemperature = 15
    day1.precipitation = true

    val day2 = Day()
    day2.dayTemperature = 16
    day2.nightTemperature = 14
    day2.precipitation = true

    day1.printDay()
    day2.printDay()
}