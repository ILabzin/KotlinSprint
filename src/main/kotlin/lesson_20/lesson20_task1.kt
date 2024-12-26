package org.example.lesson_20

fun main() {

    val newLambda: (String) -> Unit = { it: String -> println("С наступающим Новым Годом, $it!") }
    newLambda("Иван")
}