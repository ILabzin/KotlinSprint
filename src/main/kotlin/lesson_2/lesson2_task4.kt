package org.example.lesson_2

const val buff: Float = 0.2f

fun main() {
    val crystal: Int = 7
    val iron: Int = 11

    val crystalBuff: Int = (crystal * buff).toInt()
    val ironBuff: Int = (iron * buff).toInt()

    println("Бонусная кристальная руда: " + crystalBuff)
    println("Бонусная железная руда: " + ironBuff)


}