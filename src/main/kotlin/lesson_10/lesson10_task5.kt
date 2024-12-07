package org.example.lesson_10

const val NAME: String = "Борис"
const val PASSWORD: String = "1234"
val basket: List<String> = mutableListOf("Хлеб", "Вода", "Соль")

fun autorizate(): String? {
    println("Введите имя пользователя")
    val userName = readln()
    println("Введите пароль")
    val userPassword = readln()
    return genereateToken(userName, userPassword)
}

fun genereateToken(userName: String, userPassword: String): String? {
    val symbols = ('0'..'9') + ('A'..'Z') + ('a'..'z')
    var token: String = ""
    return if (userName == NAME || userPassword == PASSWORD) {
        for (i in 1..32) {
            token += symbols.random()
        }
        token
    } else null
}

fun checkBasket(token: String): String {
    return basket.toString()
}

fun main() {
    val rezult = autorizate()
    if (rezult == null) println("Логин или пароль неверные")
    else println(checkBasket(rezult))
}