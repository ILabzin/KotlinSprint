package org.example.lesson_16

class Order(
    private val id: Int,
    private var status: String = "Заказ принят"
) {
    private fun replaceStatus(newStatus: Int) {

        when (newStatus) {
            1 -> status = "Заказ собран"
            2 -> status = "Заказ в пути"
            3 -> status = "Заказ доставлен"
            else -> return
        }
    }

    fun setStatus(newStatus: Int) {
        replaceStatus(newStatus)
    }

    override fun toString(): String {
        return "Order(id='$id', status='$status')"
    }
}

fun main() {
    val order = Order(1)
    println(order)

    println(
        """
            Хотите поменять заказ?
            1. Поменять на "Заказ собран"
            2. Поменять на "Заказ в пути"
            3. Поменять на "Заказ доставлен"
            0. Ничего не менять
        """.trimIndent()
    )

    val newStatus: Int = readln().toInt()

    order.setStatus(newStatus)
    println(order)
}