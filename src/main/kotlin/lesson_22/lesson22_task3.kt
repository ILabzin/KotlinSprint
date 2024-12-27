package org.example.lesson_22

data class People11(val name: String, val age: Int, val isMarried: Boolean)

fun main() {
    val people11 = People11("Вася", 22, true)
    val (name, age, isMarried) = people11
    println("Имя: $name, Возраст: $age, В браке: $isMarried")
}