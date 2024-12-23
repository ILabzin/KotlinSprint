package org.example.lesson_17

class Package(_id: Int) {
    val id = _id
    var status: String = ""
        set(value) {
            field = value
            countMovement++
        }
    var countMovement: Int = 0
}

fun main() {
    val packageInMail = Package(1)
    packageInMail.status = "Москва"
    packageInMail.status = "Петушки"
    println(packageInMail.countMovement)
}