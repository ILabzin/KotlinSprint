package org.example.lesson_4

const val goodSun: Boolean = true
const val goodTent: Boolean = true
const val goodWater: Int = 20
const val badSeason: String = "зима"

fun main() {
    val todaySun: Boolean = true
    val todayTent: Boolean = true
    val todayWater: Int = 20
    val todaySeason: String = "зима"

    val rezult: Boolean =
        (todaySun == goodSun) && (todayTent == goodTent) && (todayWater == goodWater) && !(todaySeason.equals(badSeason))

    println("Благоприятные ли условия сейчас для роста бобовых? $rezult")

}