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
}

fun main() {
    val dayInMonth = 30
    val randomTemperature = 1..20
    val setDay = mutableSetOf<Day5>()
    for (i in 1..dayInMonth) {
        val random = Random()
        val randomBoolean = random.nextBoolean()
        setDay.add(Day5(randomTemperature.random(), randomTemperature.random(), randomBoolean))
    }
    val countPresipitation = setDay.filter { it.precipitation }.size
    val mediumDay = setDay.map{it.nightTemperatureKelvin}.average()
    val mediumNight = setDay.map{it.dayTemperatureKelvin}.average()

    println(("Количество дней с осадками: $countPresipitation"))
    println(String.format("Средняя температура днем в Кельвинах: %.2f",mediumDay))
    println(String.format("Средняя температура ночью в Кельвинах: %.2f",mediumNight))
}