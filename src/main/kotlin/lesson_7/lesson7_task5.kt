package org.example.lesson_7

fun main() {

    var passwordLength: Int
    val numberDia = 48..57
    val wordsDia = 97..122
    val bigWordsDia = 65..90
    val allDia = numberDia + wordsDia + bigWordsDia

    while (true) {
        println("Введите длинну пароля")
        passwordLength = readln().toInt()
        if (passwordLength >= 6) break
        else println("Пароль слишком короткий")
    }
    val password: MutableList<String> = mutableListOf()

    password.add(numberDia.random().toChar().toString())
    password.add(wordsDia.random().toChar().toString())
    password.add(bigWordsDia.random().toChar().toString())

    for (i in 4..passwordLength) password.add(allDia.random().toChar().toString())

    password.shuffle()

    println(password.joinToString(""))

}