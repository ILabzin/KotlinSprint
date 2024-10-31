package org.example.lesson_5


const val rightNumber1 = 7
const val rightNumber2 = 8

fun main() {
    println("Введите 2 числа:")
    val number1 = readln().toInt()
    val number2 = readln().toInt()
    var count = 0

    if ((number1 == rightNumber1) || (number1 == rightNumber2)) count++
    if ((number2 == rightNumber1) || (number2 == rightNumber2)) count++

    when(count) {
        0-> println("Неудача!")
        1-> println("Вы выиграли утешительный приз!")
        2-> println("Поздравляем! Вы выиграли главный приз!")
    }
    println("Нужные числа - $rightNumber1 и $rightNumber2")
}