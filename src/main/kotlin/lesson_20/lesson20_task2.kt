package org.example.lesson_20

class Player(
    val name: String,
    var hp: Int = 100,
    val maxHp: Int = 100,
) {
    override fun toString(): String {
        return "Player(name='$name', hp=$hp, maxHp=$maxHp)"
    }
}

fun main() {
    val recoverHp: (Player) -> Unit = { it: Player -> it.hp = it.maxHp }

    val player = Player("МегаУбиватор666", 60)
    println(player)
    recoverHp(player)
    println(player)
}