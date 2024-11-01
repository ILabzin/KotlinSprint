package org.example.lesson_7

fun main() {
    println("Сколько секунд засечь?")
    val number = readln().toInt()

    for (i in number downTo 1) {
        println(i)
        Thread.sleep(1000)

    }
    println("Время вышло")
}