package org.example.lesson_7

fun main() {

    var password: String = ""
    var symbol: String
    var number: Int
    var passwordLength: Int

    while (true) {
        println("Введите длинну пароля")
        passwordLength = readln().toInt()
        if (passwordLength >= 6) break
        else println("Пароль слишком короткий")
    }

    while (password.length < passwordLength) {
        number = (48..122).random()
        if ((number in 58..64) || (number in 91..96)) {
            continue
        }
        symbol = number.toChar().toString()
        password += symbol
    }
    println(password)
}