package org.example.lesson_2

const val buff: Int = 20

fun main() {
    val crystal: Int = 7
    val iron: Int = 11

    val crystalBuff: Int = (crystal * (buff/100))
    val ironBuff: Int = (iron * (buff/100))

    println("Бонусная кристальная руда: " + crystalBuff)
    println("Бонусная железная руда: " + ironBuff)




}