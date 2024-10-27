package org.example.lesson_4

const val table = 13

fun main() {
    val sunday = 13
    val monday = 9

    println("Доступность столиков на сегодня: ${sunday < table}")
    println("Доступность столиков на завтра: ${monday < table}")
}