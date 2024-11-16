package org.example.lesson_10

fun rollDice(): Int = (1..6).random()
fun createRound(number1: Int, number2: Int): Boolean = number1 > number2

fun main() {

    var count = 0
    var peopleNumber: Int
    var computerNumber: Int
    var playOrNo: String

    while (true) {
        println("Да начнется игра")
        peopleNumber = rollDice()
        computerNumber = rollDice()
        println("У человека выпало $peopleNumber")
        println("У компьютера выпало $computerNumber")
        if (createRound(peopleNumber, computerNumber)) {
            println("Человек победил")
            count++
        } else println("Компьютер победил")

        println("Желаете сыграть еще раз? да/нет")
        playOrNo = readln()
        if (playOrNo.equals("нет", ignoreCase = true)) {
            println("Игра закончена. Вы выиграли $count раз")
            break
        }


    }

}