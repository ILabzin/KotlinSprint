package org.example.lesson_20

class Player18(
    val name: String,
    var hp: Int = 100,
    val maxHp: Int = 100,
) {
    override fun toString(): String {
        return "Player(name='$name', hp=$hp, maxHp=$maxHp)"
    }
}

fun main() {
    val recoverHp: (Player18) -> Unit = { it: Player18 -> it.hp = it.maxHp }

    val player = Player18("МегаУбиватор666", 60)
    println(player)
    recoverHp(player)
    println(player)
}