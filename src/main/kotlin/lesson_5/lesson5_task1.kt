package org.example.lesson_5

fun main() {
    val number1: Int = (1..10).random()
    val number2: Int = (1..10).random()
    println("Для авторизации введите в ответе сумму чисел $number1 и $number2")

    val rezult: Int = readln().toInt()
    if (rezult == (number1 + number2)) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}