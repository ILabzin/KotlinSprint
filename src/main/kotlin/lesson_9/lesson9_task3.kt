package org.example.lesson_9

fun main() {

    val egg = 0
    val milk = 1
    val bread = 2

    val arrayForOne = arrayListOf(egg, milk, bread)

    println("Сколько порций приготовить?")
    val numberDose = readln().toInt()

    var newArray = arrayForOne.map { it * numberDose }

    println(
        "На $numberDose порций вам понадобится: Яиц – ${newArray[egg]}, молока – ${newArray[milk]}," +
                " сливочного масла – ${newArray[bread]}"
    )
}