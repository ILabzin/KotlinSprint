package org.example.lesson_5

import kotlin.math.pow

fun main() {
    println("Скажите свой рост в метрах:")
    val height = readln().toDouble()
    println("Скажите свой вес:")
    val weight = readln().toDouble()

    val imt = weight / height.pow(2.0)
    val formattedNumber = String.format("%.2f", imt)

    var result: String = when {
        imt < 18.5 -> "Недостаточная масса тела"
        imt < 25 -> "Нормальная масса тела"
        imt < 30 -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    println("Ваш ИМТ составляет ${formattedNumber}. Это $result")
}