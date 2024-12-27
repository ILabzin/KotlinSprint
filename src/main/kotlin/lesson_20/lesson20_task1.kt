package org.example.lesson_20

fun main() {

    val newLambda: (String) -> String = { it: String -> "С наступающим Новым Годом, $it!" }
    println(newLambda("Иван"))
}