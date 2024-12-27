package org.example.lesson_21

fun String.vowelCount(): Int {
    val stringToCharArray = this.toCharArray()
    val ref: String = "aeiouAEIOU"
    var count = 0
    for (element in stringToCharArray)

        if (ref.indexOf(element) != -1) {
            count++
        }
    return count
}

fun main() {
    val example: String = "ererererttt"
    println(example.vowelCount())
}