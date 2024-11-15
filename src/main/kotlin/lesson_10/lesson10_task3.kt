package org.example.lesson_10

fun generatePassword(int: Int): String {
    val number = 0..9
    val symbol = ' '..'/'
    var password: String = ""

    for (i in 1..int) {
        if (i % 2 == 0) password += number.random()
        else password += symbol.random()
    }
    return password
}

fun main() {

    println("Какой длины нужен пароль?")
    println("Пароль готов: ${generatePassword(readln().toInt())}")
}