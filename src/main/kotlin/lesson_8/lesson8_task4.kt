package org.example.lesson_8

fun main() {
    val arrayDish = arrayOf("Мука", "Вода", "Соль", "Сахар", "Дрожжи", "Подсолнечное масло")

    for (i in arrayDish) println(i)

    println("Введите название ингридиента для замены")

    val ingridient: String = readln()

    val rezult = arrayDish.indexOf(ingridient)

    if (rezult == -1) println("Такого ингридиента нет")
    else {
        println("На какой ингридиент вы хотите заменить $ingridient")
        val newIngridient = readln()
        arrayDish[rezult] = newIngridient

        println("Готово! Вы сохранили следующий список:")
        for (i in arrayDish) println(i)
    }

}