package org.example.lesson_5

fun main() {
    val rightNumber1 = (0..42).random()
    val rightNumber2 = (0..42).random()
    val rightNumber3 = (0..42).random()
    val luckyNumbers = setOf(rightNumber1, rightNumber2, rightNumber3)

    println("Введите 3 числа:")
    val number1 = readln().toInt()
    val number2 = readln().toInt()
    val number3 = readln().toInt()
    val peopleNumbers = setOf(number1, number2, number3)

    val intersection = peopleNumbers.intersect(luckyNumbers)

    if (intersection.size == 3) println("Ты угадал все числа и выиграл джекпот!")
    else if (intersection.size == 2) println("Ты угадал два числа и получаешь крупный приз!")
    else if (intersection.size == 1) println("Ты получишь утешительный приз!")
    else println("Не угадал!")

    println("Нужные числа - $rightNumber1, $rightNumber2, $rightNumber3")
}