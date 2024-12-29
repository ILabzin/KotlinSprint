package org.example.lesson_21

fun List<Int>.evenNumbersSum(): Int {
    return this.filter { it % 2 == 0 }.sum()
}

fun main() {
    val list1 = listOf<Int>(2, 3, 4, 5, 56, 6, 7, 7, 7)
    println(list1.evenNumbersSum())
}