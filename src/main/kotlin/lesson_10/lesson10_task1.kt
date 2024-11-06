package org.example.lesson_10

val number = 1..6

fun custCube(): Int {
    return number.random()
}

fun main() {
    println("Человек бросает кубик")
    val people = custCube()
    println("Человек выбросил $people")
    println("компьютер бросает кубик")
    val computer = custCube()
    println("Компьютер выбросил $computer")

    if (people > computer) println("Победил человек")
    else if (people < computer) println("Победил компьютер")
    else println("Победила дружба")

}