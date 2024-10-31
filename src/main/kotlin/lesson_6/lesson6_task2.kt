package org.example.lesson_6

fun main() {
    while (true) { // я так понял условие "Вставать на паузу", цикл бесконечный, это понимаю
        println("Какое количество секунд надо засечь?")
        var seconds = readln().toInt()
        var count = 0

        while (count < seconds) {
            println("${count++}")
            Thread.sleep(1000)
        }
        println("Прошло $seconds секунд")
    }
}