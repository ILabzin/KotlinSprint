package org.example.lesson_19

enum class Fish(val text: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Cкалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок")
}

fun main() {

    Fish.values().forEach { println(it.text) }
}
