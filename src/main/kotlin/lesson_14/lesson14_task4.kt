package org.example.lesson_14

abstract class CosmicBody(
    val name: String,
    val atmosphere: Boolean,
    val suitableForLanding: Boolean,
)

class Planet(
    name: String,
    atmosphere: Boolean,
    suitableForLanding: Boolean,
    val setSputnik: Set<Sputnik>,
) : CosmicBody(name, atmosphere, suitableForLanding) {
    fun info() {

        println("Планета $name имеет следующие спутники:")
        setSputnik.forEach() { println(it.name) }
    }
}

class Sputnik(
    name: String,
    atmosphere: Boolean,
    suitableForLanding: Boolean,
) : CosmicBody(name, atmosphere, suitableForLanding) {

}

fun main() {
    val planet = Planet(
        "Марс", true, true,
        setOf(
            Sputnik("Фобос", false, false),
            Sputnik("Деймос", false, false)
        )
    )

    planet.info()
}