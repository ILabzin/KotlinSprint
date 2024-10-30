package org.example.lesson_5

const val GOOD_AGE = 18

fun main() {
    val userYear = readLine()!!.toInt()

    if ((2024 - userYear) >= GOOD_AGE) {
        println("Показать экран со скрытым контентом")
    }
    else println("Вернуться на главный экран")
}