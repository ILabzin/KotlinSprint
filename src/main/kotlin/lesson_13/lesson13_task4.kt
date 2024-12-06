package org.example.lesson_13

class TelephoneBook {

    val userSet = mutableSetOf(
        User8("Vova", 547674858, "Poppi"),
        User8("Viva", 547674859, "Poppi"),
        User8("Vila", 547674857, "null"),
        User8("Pila", 547674856, null),
        User8("Poila", 547674855, null),
    )

    fun printBook() {
        userSet.forEach() {
            it.printUser()
        }
    }

    fun addUser() {
        println("Введите имя контакта:")
        val name = readln()
        println("введите номер телефона:")
        val number = readln().toLongOrNull();
        if (number == null) {
            println("Номер нужен обязательно!")
            return
        }
        println("Введите название компании")
        val company: String? = readlnOrNull() // не понимаю как заставить возвращать null, а записывать company=""
        userSet.add(User8(name, number, company))
    }
}

class User8(
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
    val newBook = TelephoneBook()
    newBook.addUser()
    newBook.printBook()

}