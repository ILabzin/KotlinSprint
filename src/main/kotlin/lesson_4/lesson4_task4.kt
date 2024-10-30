package org.example.lesson_4

val arm: Boolean = true
val leg: Boolean = true
val back: Boolean = true
val press: Boolean = true

fun day(int: Int) {

    if (int % 2 == 0) {
        println(
            """
                Упражнения для рук:    ${!arm}
                Упражнения для ног:    ${leg}
                Упражнения для спины:  ${back}
                Упражнения для пресса: ${!press}                
            """.trimIndent()
        )
    } else println(
        """
                Упражнения для рук:    ${arm}
                Упражнения для ног:    ${!leg}
                Упражнения для спины:  ${!back}
                Упражнения для пресса: ${press}                
            """.trimIndent()
    )
}

fun main() {

    day(5)
}
