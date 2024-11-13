package org.example.lesson_7

fun main() {

    var password: String = ""
    var symbol: String
    val numberDia = 48..57
    val wordsDia = 97..122
    var number: Int

    for (i in 1..6) {
        number = if ((i % 2) == 0) wordsDia.random()
        else {
            numberDia.random()
        }


        symbol = number.toChar().toString()
        password += symbol
    }

    println(password)
}