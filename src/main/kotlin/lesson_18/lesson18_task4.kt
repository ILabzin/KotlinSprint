package org.example.lesson_18

abstract class Box(val height: Int) {
    abstract fun calculateArea(): Int
}

class Rectangle(height: Int, val width: Int, val length: Int) : Box(height) {
    override fun calculateArea(): Int {
        return (height * width * length)
    }
}

class Cube112(height: Int) : Box(height) {
    override fun calculateArea(): Int {
        return (height * height * height)
    }
}

fun main() {
    val box1 = Rectangle(2,3,4)
    val box2 = Cube112(15)

    println(box1.calculateArea())
    println(box2.calculateArea())
}