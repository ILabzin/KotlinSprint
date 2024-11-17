package org.example.lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val mail: String,
) {

}

fun main() {
    val user1: User = User(1, "Van", "1234", "12@34")
    val user2: User = User(2, "Van2", "12345", "12@345")

    println(
        """
        id: ${user1.id}
        login: ${user1.login}
        password: ${user1.password}
        mail: ${user1.mail}
    """.trimIndent()
    )

    println(
        """
        id: ${user2.id}
        login: ${user2.login}
        password: ${user2.password}
        mail: ${user2.mail}
    """.trimIndent()
    )
}