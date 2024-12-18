package org.example.lesson_13

class TelephoneBook1 {

    private val userSet = mutableSetOf(
        User12("Vova", 547674858, "Poppi"),
        User12("Viva", 547674859, "Poppi"),
        User12("Vila", 547674857, "null"),
        User12("Pila", 547674856, null),
        User12("Poila", 547674855, null),
    )

    fun printBook() {
        userSet.forEach {
            it.printUser()
        }
    }

    fun getUserSet(): Set<User12> {  //решил через геттер реализовать
        return userSet
    }
}

class User12(
    val name: String,
    val number: Long,
    val company: String? = null,
) {

    fun printUser() {
        val companyInText = company ?: "<не указано>"
        println("-Имя:$name \n-Номер: $number \n-Компания: $companyInText")
    }
}

fun main() {

    println("Напишите номер:")
    try {
        val number = readln().toLong()
        println(number)
    } catch (e: NumberFormatException) {
        println("Ошибка NumberFormatException  ${e.message}")
    }
}