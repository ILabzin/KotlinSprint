package org.example.lesson_4

const val averageWeightMin = 35
const val averageWeightMax = 100
const val averageCapacity = 100


fun main() {

    val item1Weight = 20
    val item1Capacity = 80

    val item2Weight = 50
    val item2Capacity = 100

    val rezult1 =
        (item1Weight > averageWeightMin)
                && (item1Weight <= averageWeightMax)
                && (item1Capacity < averageCapacity)


    val rezult2 =
        (item2Weight > averageWeightMin)
                && (item2Weight <= averageWeightMax)
                && (item2Capacity < averageCapacity)


    println("Груз с весом $item1Weight кг и объемом $item1Capacity л соответствует категории 'Average': $rezult1")
    println("Груз с весом $item2Weight кг и объемом $item2Capacity л соответствует категории 'Average': $rezult2")
}