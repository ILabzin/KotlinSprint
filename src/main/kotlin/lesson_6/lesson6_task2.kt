package org.example.lesson_6

fun main() {

    println("Какое количество секунд надо засечь?")

    val seconds: Long = readln().toLong()

    Thread.sleep(seconds * 1000)

    println("Прошло $seconds секунд")
}