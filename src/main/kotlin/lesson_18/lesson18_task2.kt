package org.example.lesson_18

abstract class Cube18 {
    abstract val diceNumber: Int
    open fun dropCube() {
        println("Выпало ${(1..diceNumber).random()}")
    }
}

class Cube4 : Cube18() {
    override val diceNumber: Int = 4

}

class Cube6 : Cube18() {
    override val diceNumber: Int = 6

}

class Cube8 : Cube18() {
    override val diceNumber: Int = 8
}

fun main() {
    val cube1 = Cube4()
    val cube2 = Cube4()
    val cube3 = Cube6()
    val cube4 = Cube8()
    val cube5 = Cube8()
    val list: MutableList<Cube18> = mutableListOf(cube1, cube2, cube3, cube4, cube5)

    list.forEach {
        it.dropCube()
    }
}