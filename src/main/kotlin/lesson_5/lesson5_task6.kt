package org.example.lesson_5

import kotlin.math.pow

fun main() {
    println("Скажите свой рост в метрах:")
    val height = readln().toDouble()
    println("Скажите свой вес:")
    val weight = readln().toDouble()

    val imt = weight / height.pow(2.0)
    val formattedNumber = String.format("%.2f", imt)
    var result: String = ""

    if (imt < 18.0) result = "недостаточная масса тела"
    else if (imt < 25.0) result = "нормальная масса тела"
    else if (imt < 30.0) result = "избыточная масса тела"
    else result = "ожирение"

    println("Ваш ИМТ составляет ${formattedNumber}. Это $result")
}