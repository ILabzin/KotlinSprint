package org.example.lesson_13

class TelephoneBook {

    private val userSet = mutableSetOf(
        User8("Vova", 547674858, "Poppi"),
        User8("Viva", 547674859, "Poppi"),
        User8("Vila", 547674857, "null"),
        User8("Pila", 547674856, null),
        User8("Poila", 547674855, null),
    )

    fun printBook() {
        userSet.forEach {
            it.printUser()
        }
    }

    fun addUser(name: String, number: Long?, company: String?) {
        if (number == null) {
            println("Номер нужен обязательно!")
            return
        }
        val companyInSet = if (company?.isEmpty() == true) null else company
        userSet.add(User8(name, number, companyInSet))
    }

    fun getUserSet(): Set<User8> {  //решил через геттер реализовать
        return userSet
    }
}

class User8(
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
    val newBook = TelephoneBook()
    println("Напишите Имя:")
    val name = readln()
    println("Напишите номер:")
    val number = readln().toLongOrNull()
    println("Напишите компанию")
    val company = readln()
    newBook.addUser(name, number, company)
    newBook.printBook()
}