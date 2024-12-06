package org.example.lesson_13

class User6(
    val name: String,
    val number: Long,
    val company: String?,
) {

    fun printUser() {
        val companyInText = company ?: "<не указано>"
        println("-Имя:$name \n-Номер: $number \n-Компания: $companyInText")
    }
}

fun main() {
    val user = User6("Vova", 899988877766, null)
    user.printUser()
}