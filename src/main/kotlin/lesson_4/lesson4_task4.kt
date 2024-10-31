package org.example.lesson_4


fun day(int: Int) {
    val flag: Boolean = (int % 2 == 0)

    println(
        """
                Упражнения для рук:    ${!flag}
                Упражнения для ног:    ${flag}
                Упражнения для спины:  ${flag}
                Упражнения для пресса: ${!flag}                
            """.trimIndent()
    )
}

fun main() {

    day(4)
}
