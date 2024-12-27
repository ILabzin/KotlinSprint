package org.example.lesson_19

enum class Cartridges(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20);
}

class Tank(
    var cartridges: Cartridges? = null
) {

    fun charge(value: String) {
        when (value) {
            "Синие" -> cartridges = Cartridges.BLUE
            "Зеленые" -> cartridges = Cartridges.GREEN
            "Красные" -> cartridges = Cartridges.RED
        }
    }

    fun shoot() {
        if (cartridges == null) println("Не заряжено")
        else println("Нанесли урона ${cartridges?.damage}")
    }
}

fun main() {
    val tank1 = Tank()
    val tank2 = Tank()
    val tank3 = Tank()
    val tank4 = Tank()

    tank1.charge("Синие")
    tank2.charge("Зеленые")
    tank3.charge("Красные")

    tank1.shoot()
    tank2.shoot()
    tank3.shoot()
    tank4.shoot()

}