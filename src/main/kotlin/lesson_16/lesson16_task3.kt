package org.example.lesson_16

class User11(
    private val id: String,
    private val password: String,
) {
    fun checkPassword(_password: String): Boolean {
        return (_password == password)
    }

    fun getId(): String {
        return id
    }
}

fun main() {
    val user = User11("1", "12")
    println("введите пароль для ${user.getId()}:")
    val _password = readln()
    println("Проверка пароля ${user.getId()}: ${user.checkPassword(_password)}")
}