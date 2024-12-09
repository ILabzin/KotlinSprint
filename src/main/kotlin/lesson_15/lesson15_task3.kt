package org.example.lesson_15

abstract class People(
    val name: String,
) {

    open fun wrightMessage() {
        println("Пишу сообщение")
    }

    open fun readMessage() {
        println("Читаю сообщение")
    }
}

class User10(name: String) : People(name)

class Administrator(name: String) : People(name) {

    fun deleteUser(user: User10) {
        println("Удаляю ${user.name}")
    }

    fun deleteMassege() {
        println("Удаляю сообщение")
    }
}

fun main() {
    val user = User10("Петя")
    val admin = Administrator("Коля")

    user.wrightMessage()
    user.readMessage()

    admin.wrightMessage()
    admin.readMessage()
    admin.deleteMassege()
    admin.deleteUser(user)
}