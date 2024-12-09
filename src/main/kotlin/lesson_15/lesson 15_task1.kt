package org.example.lesson_15

interface Swim {
    fun swim()
}

interface Fly {
    fun fly() {
        println("Машу крыльями")
    }
}

class Carp : Swim {
    override fun swim() {
        println("Машу плавниками и плыву")
    }
}

class Duck : Swim, Fly {
    override fun swim() {
        println("Гребу лапами")
    }

}

class Parrot() : Fly {

}

fun main() {
    val carp = Carp()
    val duck = Duck()
    val parrot = Parrot()

    println("Карась:")
    carp.swim()

    println("Утка:")
    duck.fly()
    duck.swim()

    println("Попугай:")
    parrot.fly()
}