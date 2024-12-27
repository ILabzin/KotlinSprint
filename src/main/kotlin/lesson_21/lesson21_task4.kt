package org.example.lesson_21

import java.io.File
import java.util.*

fun File.writeWord(string: String) {
    val newString = string.lowercase(Locale.getDefault())
    val oldText = this.readText()
    val newFile = File(this.name)
    newFile.writeText(newString)
    newFile.writeText(oldText)
}