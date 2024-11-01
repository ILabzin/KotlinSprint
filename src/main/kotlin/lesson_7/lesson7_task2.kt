package org.example.lesson_7

fun main() {
    var number:Int
    var peopleNumber:Int

    while (true) {
        number= (1000..9999).random()
        println("Ваш код авторизации: $number")
        println("Введите код авторизации")
        peopleNumber = readln().toInt()
        if (peopleNumber==number) break

    }
}