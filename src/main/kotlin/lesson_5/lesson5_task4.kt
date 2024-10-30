package org.example.lesson_5

val people = mutableMapOf("Zaphod" to "PanGalactic")

fun baza(str: String): Boolean {
    var rezult: Boolean = false
    for (person in people) {
        if (person.key.equals(str)) rezult = true
    }
    return rezult
}

fun main() {
    println("Введите свои данные...")

    val login = readLine()
    var intidif: Boolean = baza(login.toString())
    if (intidif) {
        println("Пользователь $login найден. Введите пароль:")
        val password = readLine().toString()
        if (password.equals(people[login])) {
            println("Проходите")
        } else println("пароль неверный")

    } else println("Такого пользователя нет, зарегистрируйтесь")

}