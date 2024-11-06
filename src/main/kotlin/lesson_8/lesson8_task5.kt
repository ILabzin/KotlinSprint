package org.example.lesson_8

fun main() {
    val rezult: String

    println("Из скольки элементов состоит рецепт?")
    val numberIngridients: Int = readln().toInt()

    val arrayDush: Array<String?> = arrayOfNulls(numberIngridients)

    for (i in 1..numberIngridients) {
        arrayDush[i - 1] = readln()
    }
    rezult = arrayDush.joinToString(", ")
    println(rezult)
}