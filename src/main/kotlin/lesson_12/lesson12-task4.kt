package org.example.lesson_12

const val DIFFERENT = 273.15

class Day4(
    dayTemperatureCelsius: Int,
    nightTemperatureCelsius: Int,
) {
    var dayTemperatureKelvin = dayTemperatureCelsius + DIFFERENT
    var nightTemperatureKelvin = nightTemperatureCelsius + DIFFERENT

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