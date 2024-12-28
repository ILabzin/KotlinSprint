package org.example.lesson_22

data class DataBook2(
    val name: String,
    val author: String
)

class RegularBook2(
    val name: String,
    val author: String
)

fun main() {
    val dataBook1 = DataBook2("Оно", "Стивен Кинг")
    val regularBook2 = RegularBook2("Они", "Стивен Некинг")

    println(dataBook1) // Метод ToString в data class автоматически переопределен
    println(regularBook2) // Метод toString по умолчанию выдает ссылку на обьект
}