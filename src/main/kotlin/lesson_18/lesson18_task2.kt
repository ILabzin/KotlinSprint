package org.example.lesson_18

abstract class Cube {
    abstract val diceNumber: Int
    open fun dropCube() {}
}

class Cube4 : Cube() {
    override val diceNumber: Int = 4

    override fun dropCube() {
        println("Выпало ${(1..diceNumber).random()}")
    }
}

class Cube6 : Cube() {
    override val diceNumber: Int = 6

    override fun dropCube() {
        println("Выпало ${(1..diceNumber).random()}")
    }
}

class Cube8 : Cube() {
    override val diceNumber: Int = 8
    override fun dropCube() {
        println("Выпало ${(1..diceNumber).random()}")
    }
}

fun main() {
    val cube1 = Cube4()
    val cube2 = Cube4()
    val cube3 = Cube6()
    val cube4 = Cube8()
    val cube5 = Cube8()
    val list: MutableList<Cube> = mutableListOf(cube1, cube2, cube3, cube4, cube5)

    list.forEach {
        it.dropCube()
    }
}