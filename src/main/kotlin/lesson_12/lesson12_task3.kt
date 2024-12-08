package org.example.lesson_12

const val DIFFERENT = 273.15

class Day3(
    dayTemperatureCelsius: Int,
    nightTemperatureCelsius: Int,
) {
    var dayTemperatureKelvin = dayTemperatureCelsius + DIFFERENT
    var nightTemperatureKelvin = nightTemperatureCelsius + DIFFERENT
    fun printDay() {
        println(
            """
            Температура днем в Кельвинах: $dayTemperatureKelvin
            Температура ночью в Кельвинах: $nightTemperatureKelvin
        """.trimIndent()
        )
    }
}

fun main() {
    val day4 = Day3(22, 16)
    day4.printDay()
}