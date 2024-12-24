package org.example.lesson_17

class Folder(
    _name: String, _secret: Boolean
) {
    val name: String = _name
        get() {
            return if (secret) {
                "Доступ запрещен"
            } else field
        }
    val secret = _secret
    var countFiles: Int = 0
        get() {
            return if (secret) {
                0
            } else field
        }
}

fun main() {
    val folder = Folder("нуха", true)
    folder.countFiles = 15
    println(folder.name)
    println(folder.countFiles)
}