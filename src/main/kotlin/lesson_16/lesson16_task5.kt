package org.example.lesson_16

class Player112(
    private val name: String,
    private var hp: Int = 100,
    private var damage: Int = 10,
    private var canRecovery: Boolean = true,
) {
    fun recovery(value: Int) {
        if (canRecovery) hp += value
    }

    fun dealDamage(value: Int) {
        hp -= value
        if (hp <= 0) perish()
    }

    private fun perish() {
        canRecovery = false
        damage = 0
        hp = 0
    }

    override fun toString(): String {
        return "Player112(name='$name', hp=$hp, damage=$damage)"
    }

}

fun main() {
    val player112 = Player112("Вася")
    println(player112)
    player112.dealDamage(10)
    println(player112)
    player112.recovery(10)
    println(player112)
    player112.dealDamage(100)
    println(player112)
    player112.recovery(50)
    println(player112)
}