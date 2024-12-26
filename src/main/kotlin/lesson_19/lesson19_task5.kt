package org.example.lesson_19

enum class Gender(val value: String) {
    MALE("Мужчина"),
    FEMALE("Женщина"),
}

class People(
    val name: String,
    val gender: Gender,
) {
    override fun toString(): String {
        return "People(name='$name', gender=$gender)"
    }
}

fun main() {
    val diaOfPeople = 1..5
    var peopleName: String
    var genderInString: String
    var gender: Gender
    val fileCabinet = mutableSetOf<People>()
    println("Добавим людей в картотеку")
    for (i in diaOfPeople) {
        println("Введите имя человека.")
        peopleName = readln()
        println("Введите пол человека. Доступно на выбор:")
        Gender.entries.forEach { println(it.value) }
        genderInString = readln()
        gender = if (genderInString == Gender.MALE.value) Gender.MALE
        else Gender.FEMALE

        fileCabinet.add(People(peopleName, gender))
    }

    fileCabinet.forEach { println(it) }
}