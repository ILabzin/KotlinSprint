package org.example.lesson_7

fun main() {
    val diapazon = 1000..9999
    var peopleNumber: Int
    var number: Int

    while (true) {
        number = diapazon.random()
        println("Ваш код авторизации: $number")
        println("Введите код авторизации")
        peopleNumber = readln().toInt()
        if (peopleNumber == number) break

    }
}