package org.example.lesson_9

fun main() {
    val arrayForOne = arrayListOf(2, 50, 15)
    val sumDose: MutableList<Int> = mutableListOf()

    println("Сколько порций приготовить?")
    val numberDose = readln().toInt()

    for (i in 0..<arrayForOne.size) {
        sumDose.add(arrayForOne[i] * numberDose)
    }
    println(
        "На $numberDose порций вам понадобится: Яиц – ${sumDose[0]}, молока – ${sumDose[1]}," +
                " сливочного масла – ${sumDose[2]}"
    )


}