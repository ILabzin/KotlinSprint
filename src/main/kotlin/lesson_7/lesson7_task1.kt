package org.example.lesson_7

fun main() {

    var password: String = ""
    var symbol: String
    val passwordLength = 6
    var number: Int

    while (password.length < passwordLength) {
        number = (48..122).random()
        if (number in 58..96) {
            continue
        }
        symbol = number.toChar().toString()
        password += symbol
    }
    println(password)
}