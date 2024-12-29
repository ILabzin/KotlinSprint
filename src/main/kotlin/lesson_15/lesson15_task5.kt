package org.example.lesson_15

interface Movable {
    fun move() {
        println("Еду")
    }
}

interface Loadable {

    abstract val maxLoad: Int

    fun load(value: Int) {
        if (value > maxLoad) println("Перевозка груза невозможна")
        else println("Загружаю груз")
    }
}

interface Boardble {

    abstract val maxPassengers: Int
    fun boardPassengers(value: Int) {
        if (value > maxPassengers) println("Перевозка невозможна")
        else println("Загружаю пассажиров")
    }
}

abstract class Car : Movable, Boardble
class Truck(override val maxPassengers: Int = 1, override val maxLoad: Int = 2000) : Car(), Loadable
class Auto(override val maxPassengers: Int = 3) : Car()

fun main() {
    val car1 = Truck()
    val car2 = Auto()
    val car3 = Truck()
    val car4 = Truck()

    car1.boardPassengers(2)
    car1.boardPassengers(1)
    car1.load(2000)
    car1.move()
    car3.boardPassengers(1)
    car3.load(2000)
    car3.move()
    car4.boardPassengers(1)
    car4.load(2000)
    car4.move()
    car2.boardPassengers(3)
    car2.move()
}