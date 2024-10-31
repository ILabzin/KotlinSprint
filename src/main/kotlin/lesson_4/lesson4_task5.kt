package org.example.lesson_4

const val goodFood = 50
const val minNumberPeople = 55
const val optimalNumberPeople = 70

fun goodOrbad(ship: Boolean, numberPeople: Int, food: Int, weather: Boolean): Boolean {

    var weCan: Boolean = (ship && (numberPeople in minNumberPeople..optimalNumberPeople) && (food > goodFood)) ||
            ((numberPeople == optimalNumberPeople) && (food >= goodFood) && weather)

    return weCan
}

fun main() {

    val fly: Boolean = goodOrbad(false, 70, 50, true)
    println("Возможность полета: $fly")

}