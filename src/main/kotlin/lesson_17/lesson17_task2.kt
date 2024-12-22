package org.example.lesson_17

class Ship2(
    _name: String,
    _speed: Int,
    _port: String,
) {

    var name: String = _name
        set(value) {
            println("Менять имя нельзя")
        }
    val speed: Int = _speed
    val port: String = _port
}

fun main() {
    val ship = Ship2("Быстрый", 15, "Находка")
    println(ship.name)
    ship.name = "Небыстрый"
    println(ship.name)
}