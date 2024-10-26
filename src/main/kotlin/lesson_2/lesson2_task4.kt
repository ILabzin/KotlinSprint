package org.example.lesson_2

const val buff: Int = 20
const val persent: Int = 100

fun main() {
    val crystal: Int = 7
    val iron: Int = 11

    val crystalBuff: Int = (crystal * (buff / persent))
    val ironBuff: Int = (iron * (buff / persent))

    println("Бонусная кристальная руда: " + crystalBuff)
    println("Бонусная железная руда: " + ironBuff)
}