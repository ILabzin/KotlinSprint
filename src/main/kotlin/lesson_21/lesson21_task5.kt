package org.example.lesson_21

fun Map<String, Int>.maxCategory(): String {
    var max = 0
    var maxCategory: String = ""
    this.forEach { entry -> if (entry.value > 0) max = entry.value }
    for (value in this) {
        if (value.value == max) maxCategory = value.key
    }

    return maxCategory
}

fun main() {
    val map: Map<String, Int> = mapOf("Сила" to 15, "Ловкость" to 20, "Телосложение" to 40)
    println(map.maxCategory())
}
