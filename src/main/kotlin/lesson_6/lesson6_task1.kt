package org.example.lesson_6

fun main() {

    println("Придумайте логин")
    val login: String = readln()
    println("Придумайте пароль")
    val password: String = readln()

    var peopleLogin: String
    var peoplePassword: String

    while (true) {
        println("Введите логин для входа")
        peopleLogin = readln()
        println("Введите пароль для входа")
        peoplePassword = readln()

        if ((login == peopleLogin) && (password == peoplePassword)) {
            println("Авторизация прошла успешно")
            break
        } else println("Неверный логин или пароль")
    }
}