package org.example.lesson_3

fun main() {
    var first: String = "E2"
    var second: String = "E4"
    var number: Int = 1

    var rezult: String = "$first-$second, $number ход"

    println(rezult)

    var move: Int = 2 + 1

    first = "D2"
    second = "D" + move
    number++

    rezult = "$first-$second, $number ход"
    println(rezult)
}