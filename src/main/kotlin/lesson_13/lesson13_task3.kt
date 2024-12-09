package org.example.lesson_13

class User7(
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
    val userSet = mutableSetOf<User7>(
        User7("Vova", 547674858, "Poppi"),
        User7("Viva", 547674859, "Poppi"),
        User7("Vila", 547674857, "null"),
        User7("Pila", 547674856),
        User7("Poila", 547674855),
    )

    val userWithCompany =
        userSet.mapNotNull { if (it.company.isNullOrEmpty()) null else it }

    userWithCompany.forEach() {
        it.printUser()
    }
}