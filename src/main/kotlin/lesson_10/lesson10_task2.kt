package org.example.lesson_10

fun checkLength(string: String): Boolean = string.length >= 4

fun main() {
    println("Введите логин")
    val id = readln()
    println("Введите пароль")
    val password = readln()
    val idLength = checkLength(id)
    val passwordLength = checkLength(password)

    if (!(idLength) || !(passwordLength)) println("Логин или пароль недостаточно длинные")
}