package org.example.lesson_14

open class Ship(
    val speed: Int = 30,
    val payload: Int = 100,
    val peopleLoad: Int = 150,
    val breakIce: Boolean = false
) {

}

class Icebreaker(
    speed: Int,
    payload: Int,
    peopleLoad: Int,
    breakIce: Boolean,
) : Ship(speed = 20, payload = 80, peopleLoad = 15, breakIce = true) {

}

class Cargoship(
    speed: Int,
    payload: Int,
    peopleLoad: Int,
    breakIce: Boolean,
) : Ship(speed = 20, payload = 150, peopleLoad = 15) {

}

