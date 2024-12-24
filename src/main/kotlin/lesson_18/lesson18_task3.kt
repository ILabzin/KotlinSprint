package org.example.lesson_18

open class Beast(val name: String, val typeOfEat: String) {
    open fun eat() {
        println("$name -> $typeOfEat")
    }

    open fun sleep() {
        println("$name - спит")
    }
}

class Fox(name: String = "Лиса", typeOfEat: String = "Ест ягоды") : Beast(name, typeOfEat) {
    override fun eat() {
        super.eat()
    }
}

class Dog(name: String = "Собака", typeOfEat: String = "Ест кости") : Beast(name, typeOfEat) {
    override fun eat() {
        super.eat()
    }
}

class Cat(name: String = "Кошка", typeOfEat: String = "Ест рыбу") : Beast(name, typeOfEat) {
    override fun eat() {
        super.eat()
    }
}

fun main() {
    val listOfBeast: List<Beast> = listOf<Beast>(Cat(), Fox(), Dog())
    listOfBeast.forEach {
        println(it.eat())
    }
}