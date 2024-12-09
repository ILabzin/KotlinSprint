package org.example.lesson_5

import kotlin.math.pow

fun main() {
    println("Скажите свой рост в метрах:")
    val height = readln().toDouble()
    println("Скажите свой вес:")
    val weight = readln().toDouble()

    val imt = weight / height.pow(2.0)
    val formattedNumber = String.format("%.2f", imt)
    val rezult: String

    when (imt) {
        in 1.0..<18.0 -> rezult = "недостаточная масса тела"
        in 18.0..<25.0 -> rezult = "нормальная масса тела"
        in 25.0..<30.0 -> rezult = "избыточная масса тела"
        else -> rezult = "ожирение"
    }
    println("Ваш ИМТ составляет ${formattedNumber}. Это $rezult")
}