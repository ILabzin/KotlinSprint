package org.example.lesson_4

fun goodOrbad(ship: Boolean, numberPeople: Int, food: Int, weather: Boolean): Boolean {

    var weCan: Boolean = (ship && (numberPeople in 55..70) && (food > 50)) ||
            ((numberPeople == 70) && (food >= 50) && weather)

    return weCan
}

fun main() {

    val fly: Boolean = goodOrbad(false, 70, 50, true)
    println("Возможность полета: $fly")

}