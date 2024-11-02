package org.example.lesson_6

fun main() {
    var number1: Int
    var number2: Int
    var answer: Int
    var count: Int = 3

    while (count > 0) {
        number1 = (1..9).random()
        number2 = (1..9).random()

        println("Докажите, что вы человек. Сколько будет $number1 + $number2")
        answer = readln().toInt()

        if (answer == (number1 + number2)) {
            println("Добро пожаловать!")
            break
        } else {
            count--
            println("Неверно. Осталось попыток: $count")
            if (count == 0) println("Доступ запрещен")
        }
    }
}