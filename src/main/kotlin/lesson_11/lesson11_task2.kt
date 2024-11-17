package org.example.lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
) {
    var bio: String = ""

    fun showUser() {
        println(
            """
        id: ${id}
        login: ${login}
        password: ${password}
        mail: ${mail}
    """.trimIndent()
        )
    }

    fun checkBio() {
        println("Назови свое bio")
        bio = readln()
    }

    fun checkPassword() {
        println("Назови текущий пароль")
        if (password == (readln())) {
            println("напиши новый пароль")
            password = readln()
            println("Пароль изменен")
        }
    }

}

fun main() {
    val newUser = User2(1, "Van", "1234", "12@34")
    newUser.checkPassword()

    newUser.showUser()
}