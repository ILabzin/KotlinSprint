package org.example.lesson_9

fun main() {
    val arrayForOne = arrayListOf(2, 50, 15)

    println("Сколько порций приготовить?")
    val numberDose = readln().toInt()

    var newArray = arrayForOne.map { it * numberDose }

    println(
        "На $numberDose порций вам понадобится: Яиц – ${newArray[0]}, молока – ${newArray[1]}," +
                " сливочного масла – ${newArray[2]}"
    )


}