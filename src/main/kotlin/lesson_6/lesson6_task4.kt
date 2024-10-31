package org.example.lesson_6

fun main() {
    val number = (0..9).random()
    var count: Int = 5
    var peopleNumber: Int

    println("Игра началась!")
    while (count > 0) {
        println("Назовите число")
        peopleNumber = readln().toInt()

        if (peopleNumber == number) {
            println("Это была великолепная игра!")
            break
        } else {
            count--
            println(
                """
            Не угадал!
            Оставшееся число попыток $count
        """.trimIndent()
            )

        }
        if (count == 0) println("Попытки закончились. Было загадано число $number")
    }
}