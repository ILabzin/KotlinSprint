package org.example.lesson_17

class User6(
    _login: String,
    _password: String,
) {
    var login = _login
        set(value) {
            field = value
            println("Логин успешно изменен")
        }
    var password: String = _password
        set(value) {
            if (password == null) field = value
            else println("Вы не можете изменить пароль")
        }
        get() {
            if (field == null) return field
            else {
                for (i in 1..field.length) codePassword = codePassword + "*"
            }
            return codePassword
        }
    var codePassword = ""
}

fun main() {
    val user6 = User6("Вася", "1234")
    println(user6.password)
    user6.password = ""
}