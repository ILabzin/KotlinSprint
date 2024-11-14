package org.example.lesson_7

fun main() {

    var password: String = ""
    val symbols: CharRange = 'a'..'z'
    val numbers: IntRange = 0..9

    for (i in 1..6) {
        if ((i % 2) == 0) {
            password += symbols.random()
        }
        else {
            password += numbers.random()
        }

    }

    println(password)
}