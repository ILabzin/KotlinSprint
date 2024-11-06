package org.example.lesson_9

fun main() {
    val arrayDish = listOf("Мука", "Вода", "Соль", "Сахар", "Дрожжи", "Подсолнечное масло")
    println("В рецепте есть следующие ингредиенты: $arrayDish")

    for (i in arrayDish) {
        println(i)
    }
}