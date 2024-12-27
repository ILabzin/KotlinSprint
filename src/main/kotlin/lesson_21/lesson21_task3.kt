package org.example.lesson_21

class Player19(
    val name: String,
    var hp: Int = 100,
    val maxHp: Int = 100,
) {
    override fun toString(): String {
        return "Player(name='$name', hp=$hp, maxHp=$maxHp)"
    }
}

fun Player19.isHealthy(): Boolean {
    var maxHealthy: Boolean = false
    if (this.hp == this.maxHp) maxHealthy = true
    return maxHealthy
}

fun main() {
    val paladin = Player19("Пал", 80, 100)
    val paladin2 = Player19("Палa", 100, 100)

    println("${paladin.name} здоров?: ${paladin.isHealthy()}")
    println("${paladin2.name} здоров?: ${paladin2.isHealthy()}")

}