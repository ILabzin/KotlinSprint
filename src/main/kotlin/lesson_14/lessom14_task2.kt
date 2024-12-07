package org.example.lesson_14

open class Ship2(
    val speed: Int = 30,
    val payload: Int = 100,
    val peopleLoad: Int = 150,
    val breakIce: Boolean = false
) {
    open fun loadShip() {
        println("Выдвигается горизонтальный трап со шкафута")
    }

    fun showShip() {
        println(
            """
            Скорость: $speed
            Грузоподьемность: $payload
            Количество человек на борту: $peopleLoad
            Может ли пробить лед: $breakIce
        """.trimIndent()
        )
    }
}

class Icebreaker2(
    speed: Int,
    payload: Int,
    peopleLoad: Int,
    breakIce: Boolean,
) : Ship2(speed = 20, payload = 80, peopleLoad = 15, breakIce = true) {

    override fun loadShip() {
        println("Открываются ворота со стороны кормы")
    }
}

class Cargoship2(
    speed: Int,
    payload: Int,
    peopleLoad: Int,
    breakIce: Boolean,
) : Ship2(speed = 20, payload = 150, peopleLoad = 15) {

    override fun loadShip() {
        println("Активируется погрузочный кран")
    }
}

fun main() {

}