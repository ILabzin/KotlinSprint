package org.example.lesson_9

fun main() {
    val ingridient: String
    val arrayDish = mutableListOf("Мука", "Вода", "Соль")
    val answer: String

    println("В рецепте есть базовые ингредиенты: $arrayDish")
    println("Желаете добавить еще?")

    answer = readln()

    if (answer.equals("да", true)) {
        println("Какой ингредиент вы хотите добавить?")
        ingridient = readln()
        arrayDish.add(ingridient)
        println("Теперь в рецепте есть следующие ингредиенты: $arrayDish")
    }
}