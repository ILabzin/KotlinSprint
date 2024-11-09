package org.example.lesson_9

fun main() {
    println("Напиши список из 5 ингридиентов через запятую")

    val allIngridients = readln()

    val arrayIngridients: List<String> = allIngridients.split(", ")
    val newArray = arrayIngridients.sorted()
    println(newArray)


}