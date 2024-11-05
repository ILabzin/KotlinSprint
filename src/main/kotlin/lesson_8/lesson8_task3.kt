package org.example.lesson_8

fun main() {
    val arrayDish = arrayOf("Мука", "Вода", "Соль", "Сахар", "Дрожжи", "Подсолнечное масло")

    println("Введите название ингридиента:")

    val ingridient: String = readln()

    val rezult = arrayDish.indexOf(ingridient)

    if (rezult == -1) println("Такого ингридиента нет")
    else println("Ингридиент $ingridient в рецепте есть")

}