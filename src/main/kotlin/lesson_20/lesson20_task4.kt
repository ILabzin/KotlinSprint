package org.example.lesson_20

fun main() {
    val listString = mutableListOf<String>("Элемент1", "Элемент2", "Элемент3", "Элемент4", "Элемент5")

    val newList = listString.map { it: String -> { element: String -> println("Нажат элемент $element") }(it) }
    for (i in 2..listString.size step 2) {
        newList[i]
    } //сдаюсь, не понимаю как строку преобразовать с помощью лямбды в лямбду

}
