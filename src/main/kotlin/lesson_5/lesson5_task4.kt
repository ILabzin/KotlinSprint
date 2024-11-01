package org.example.lesson_5

val people = mutableMapOf("Zaphod" to "PanGalactic")

fun searchInMap(str: String): Boolean {
    var rezult = false
    for (person in people) {
        if (person.key == str) rezult = true
    }
    return rezult
}

fun main() {
    println("Введите свои данные...")

    val login = readln()
    var identification: Boolean = searchInMap(login)
    if (identification) {
        println("Пользователь $login найден. Введите пароль:")
        val password = readln()
        if (password == people[login]) {
            println("Проходите")
        } else println("пароль неверный")

    } else println("Такого пользователя нет, зарегистрируйтесь")

}