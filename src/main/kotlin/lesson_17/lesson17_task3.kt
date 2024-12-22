package org.example.lesson_17

import java.io.File

class Folder(
    _name: String,
    _secret: Boolean
) {
    val name = _name
    val secret = _secret
    var countFiles: Int? = 0
        get() {
            return if (secret) {
                println("Доступ запрещен")
                null
            } else field
        }
}

fun main() {
    val folder = Folder("нуха", true)
    folder.countFiles = 15
    val count = folder.countFiles
}