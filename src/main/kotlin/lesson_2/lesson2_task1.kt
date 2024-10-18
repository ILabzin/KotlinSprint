package org.example.lesson_2

fun main() {
    val people1: Float = 3.0f
    val people2: Float = 4.0f
    val people3: Float = 3.0f
    val people4: Float = 5.0f
    val peopleCount: Int = 4

    val arithmetic: Float = (people1 + people2 + people3 + people4) / peopleCount

    println(String.format("%.2f", arithmetic))
}