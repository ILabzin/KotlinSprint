package org.example.lesson_6

fun main() {

    println("Какое количество секунд надо засечь?")
    var seconds = readln().toInt()

    while (seconds > 0) {
        println("Осталось секунд :${seconds--}")
        Thread.sleep(1000)
    }
    println("Время вышло")

}