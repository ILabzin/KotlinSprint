package org.example.lesson_8

fun main() {
    val rezult: String

    println("Из скольки элементов состоит рецепт?")


    val arrayDush = Array(readln().toInt()) { readln() }

    rezult = arrayDush.joinToString(", ")
    println(rezult)
}