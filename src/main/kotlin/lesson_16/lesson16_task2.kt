package org.example.lesson_16

class Circle(
    private val radius: Double
) {
    private val PI = 3.14

    fun circleArea() {
        println("Площадь данного круга: ${PI * Math.pow(radius, 2.0)}")
    }

    fun circlePerimetre() {
        println("Периметр данного круга: ${2 * PI * radius}")
    }
}

fun main() {
    val circle = Circle(5.0)
    circle.circlePerimetre()
    circle.circleArea()
}