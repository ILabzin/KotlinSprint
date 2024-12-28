package org.example.lesson_22

data class DataBook(
    val name: String,
    val author: String
)

class RegularBook(
    val name: String,
    val author: String
)

fun main() {
    val dataBook1 = DataBook("Оно", "Стивен Кинг")
    val dataBook2 = DataBook("Оно", "Стивен Кинг")

    val regularBook1 = RegularBook("Они", "Стивен Некинг")
    val regularBook2 = RegularBook("Они", "Стивен Некинг")

    println(dataBook1 == dataBook2) //метод equals в data классе позволяет сравнивать по полям(в нем сравниваются поля)
    println(regularBook1 == regularBook2) // сравнивается по ссылкам, они разные несмотря на одинаковые поля
}