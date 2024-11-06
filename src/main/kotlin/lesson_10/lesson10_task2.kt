package org.example.lesson_10

fun checkingLength(string: String): Boolean {

    var flag: Boolean = false
    if (string.length <= 4) flag = true
    return flag
}

fun main() {
    println("Введите логин")
    val id = readln()
    println("Введите пароль")
    val password = readln()
    val idLength = checkingLength(id)
    val passwordLength = checkingLength(password)

    if (idLength || passwordLength) println("Логин или пароль недостаточно длинные")
}