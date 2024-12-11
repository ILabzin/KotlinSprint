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

//    fun addUser(name: String, number: Long?, company: String?) {
//        if (number == null) {
//            println("Номер нужен обязательно!")
//            return
//        }
//        val companyInSet = if (company?.isEmpty() == true) null else company
//        userSet.add(User12(name, number, companyInSet))
//    }

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
//    val newBook = TelephoneBook1()
//    println("Напишите Имя:")
//    val name = readln()
    println("Напишите номер:")
    try {
        val number = readln().toLong()
        println(number)
    } catch (e: NumberFormatException) {
        println("Ошибка NumberFormatException  ${e.message}")
    }

//    println("Напишите компанию")
//    val company = readln()
//    newBook.addUser(name, number, company)
//    newBook.printBook()
}