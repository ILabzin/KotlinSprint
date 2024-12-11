package org.example.lesson_15

interface SearchComponent {
    fun searchComponent(component: Component): Boolean {
        var isTrue = false
        println("Ищу компонент")
        return isTrue
    }
}

abstract class Product(
    val name: String,
    val count: Int = 0,
)

class Instrument(
    name: String,
    count: Int,
    private val list: MutableList<Component>,
) : Product(name, count), SearchComponent {
    fun getList(): List<Component> {
        return list
    }
}

class Component(
    name: String,
    count: Int,
) : Product(name, count)

fun main() {

    val component = Component("Какой-то компонент", 15)
    val instrument = Instrument(
        "Гитара", 10,
        mutableListOf<Component>(
            Component("Дека", 1),
            Component("Струны", 6)
        )
    )
    instrument.searchComponent(component)
}