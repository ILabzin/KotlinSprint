package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val firstMoney: Int = 70_000
    val persents: Double = 16.7
    val time: Int = 20
    val persent = 100

    val moneyAfter = firstMoney * ((1 + persents / persent)).pow(time)

    println(String.format("%.3f", moneyAfter))

}