package org.example.lesson_14

abstract class Figure(
    val color: String,
) {
    open fun countArea(): Double {
        return TODO()
    }
    open fun countPerimeter(): Double {
        return TODO()
    }
}

class Circle(
    color: String,
    val radius: Int,
) : Figure(color) {
    override fun countArea(): Double {
        return (kotlin.math.PI * Math.pow(radius.toDouble(), 2.0))
    }
    override fun countPerimeter(): Double {
        return (2 * kotlin.math.PI * radius)
    }
}

class Rectangle(
    color: String,
    val height: Int,
    val width: Int,
) : Figure(color) {
    override fun countArea(): Double {
        return (height * width).toDouble()
    }
    override fun countPerimeter(): Double {
        return (2 * (height + width)).toDouble()
    }
}

fun main() {
    val setFigure = setOf<Figure>(
        Rectangle("Черный", 12, 15),
        Rectangle("Белый", 11, 11),
        Circle("Черный", 16),
        Circle("Белый", 18)
    )

    var sumPerimeter: Double = 0.0
    var sumArea: Double = 0.0

    setFigure.forEach() {
        if (it.color == "Черный") sumPerimeter += it.countPerimeter()
        if (it.color == "Белый") sumArea += it.countArea()
    }

    println("Сумма периметров черных фигур: $sumPerimeter")
    println("Сумма площадей белых фигур: $sumArea")
}