package org.example.lesson_12

const val DIFFERENT1 = 273.15

class Day4(
    dayTemperatureCelsius: Int,
    nightTemperatureCelsius: Int,
) {
    var dayTemperatureKelvin = dayTemperatureCelsius + DIFFERENT1
    var nightTemperatureKelvin = nightTemperatureCelsius + DIFFERENT1

    init {
        println(
            """
            Температура днем в Кельвинах: $dayTemperatureKelvin
            Температура ночью в Кельвинах: $nightTemperatureKelvin
        """.trimIndent()
        )
    }
}

fun main() {
    val day4 = Day4(22, 16)
}