package org.example.lesson_21

fun String.vowelCount(): Int {
    val stringToCharArray = this.toCharArray()
    val vowels: String = "aeiouAEIOU"
   return this.count { it in vowels }
}

fun main() {
    val example: String = "ererererttt"
    println(example.vowelCount())
}