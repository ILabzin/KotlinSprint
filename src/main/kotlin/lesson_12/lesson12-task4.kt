package org.example.lesson_12

class Day4(
    var dayTemperatureCelsius: Int,
    var nightTemperatureCelsius: Int,
) {
    var dayTemperatureKelvin = dayTemperatureCelsius + 273.15
    var nightTemperatureKelvin = nightTemperatureCelsius + 273.15
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