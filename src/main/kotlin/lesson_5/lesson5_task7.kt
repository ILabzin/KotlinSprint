package org.example.lesson_5

fun main() {

    println("Введите расстояние")
    val distance: Double = readln().toDouble()
    println("Введите расход на 100 км")
    val fuelRate: Double = readln().toDouble()
    println("Введите цену за литр")
    val price: Double = readln().toDouble()

    val allFuel = (distance * fuelRate) / 100
    val allPrice = allFuel * price
    println(String.format("Общее количество необходимого топлива %.2f. Общая цена %.2f", allFuel, allPrice))
}