package org.example.lesson_20

class Player(val key: Boolean)

fun main() {
    val inspectKey: (Player) -> String = { it: Player ->
        if (it.key) "Игрок открыл дверь"
        else "Дверь заперта"
    }

    val player1 = Player(true)
    println(inspectKey(player1))
}