package org.example.lesson_21

fun Map<String, Int>.maxCategory(): String? {

    return this.maxByOrNull { it.value }?.key
}

fun main() {
    val map: Map<String, Int> = mapOf("Сила" to 15, "Ловкость" to 20, "Телосложение" to 40)
    println(map.maxCategory())
}
