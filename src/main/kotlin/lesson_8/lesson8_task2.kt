package org.example.lesson_8

fun main() {
    val arrayDish = arrayOf("Мука", "Вода", "Соль", "Сахар", "Дрожжи", "Подсолнечное масло")

    println("Введите название ингридиента:")

    val ingridient: String = readln()

    for (i in arrayDish) {
        if (ingridient == i) {
            println("Ингридиент $ingridient в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")

}