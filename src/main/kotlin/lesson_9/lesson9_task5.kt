package org.example.lesson_9

import java.util.*

fun main() {

    var ingridients: String
    val numberOfIngridients = 5
    val arrayDish: MutableSet<String> = sortedSetOf()

    while (true) {
        println("Введите ингридиент")
        ingridients = readln()
        if (arrayDish.contains(ingridients)) println("Такой элемент есть")
        arrayDish.add(ingridients)
        if (arrayDish.size == numberOfIngridients) break
    }
    println(arrayDish.joinToString(", ")
        .replaceFirstChar { it.uppercase() })
}