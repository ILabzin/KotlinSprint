package org.example.lesson_3


fun main() {

    var nextActionChess = readlnOrNull()   // Вот так можно принять строку от игрока
    var nextChess = "D2-D4;0"

    var splittedString = nextChess.split('-', ';')
    var firstData = splittedString[0]
    var secondData = splittedString[1]
    var thirdData = splittedString[2]

    println(firstData)
    println(secondData)
    println(thirdData)


}
