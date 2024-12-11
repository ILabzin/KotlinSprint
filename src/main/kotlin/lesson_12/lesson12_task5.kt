package org.example.lesson_12

import java.util.Random

const val DIFFERENT2 = 273.15

class Day5(
    dayTemperatureCelsius: Int,
    nightTemperatureCelsius: Int,
    val precipitation: Boolean,
) {
    var dayTemperatureKelvin = dayTemperatureCelsius + DIFFERENT2
    var nightTemperatureKelvin = nightTemperatureCelsius + DIFFERENT2
//    init {
//        println(
//            """
//            Температура днем в Кельвинах: $dayTemperatureKelvin
//            Температура ночью в Кельвинах: $nightTemperatureKelvin
//        """.trimIndent()
//        )
//    }
}

fun main() {
    val setDay = mutableSetOf<Day5>()
    for (i in 1..30) {
        val random = Random()
        val randomBoolean = random.nextBoolean()
        setDay.add(Day5((1..20).random(), (1..15).random(), randomBoolean))
    }
    val countPresipitation = setDay.filter { it.precipitation }.size
    val mediumDay = setDay.map{it.nightTemperatureKelvin}.average()
    val mediumNight = setDay.map{it.dayTemperatureKelvin}.average()

    println(("Количество дней с осадками: $countPresipitation"))
    println(String.format("Средняя температура днем в Кельвинах: %.2f",mediumDay))
    println(String.format("Средняя температура ночью в Кельвинах: %.2f",mediumNight))
}