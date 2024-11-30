package org.example.lesson_10

const val name: String = "Борис"
const val password: String = "1234"
val symbols = ('0'..'9') + ('A'..'Z') + ('a'..'z')
val basket: List<String> = mutableListOf("Хлеб", "Вода", "Соль")

fun autorizated(): String? {
    var token = ""
    println("Введите имя пользователя")
    val userName = readln()
    println("Введите пароль")
    val userPassword = readln()
    if (userName == name || userPassword == password) {
        for (i in 1..32) token += symbols.random()
        return token
    } else return null
}

fun checkBasket(token: String): String {
    return basket.toString()
}

fun main() {
    val rezult = autorizated()
    if (rezult == null) println("Логин или пароль неверные")
    else println(checkBasket(rezult))
}