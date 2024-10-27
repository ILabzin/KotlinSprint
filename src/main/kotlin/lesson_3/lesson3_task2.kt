package org.example.lesson_3

fun main() {
    val name: String = "Татьяна" //var до этого принял решение тут использовать, если человек захочет сменить имя
    var Surname: String = "Андреева"
    val patronymic: String = "Сергеевна"
    var age = 20

    //var newSurname: String = "Сидорова" я предположил, что старую фамилию тоже
    //стоит хранить в отдельной переменной и не "затирать". Для базы это хорошо, какое-то
    //обращение или запрос может быть по старой фамилии

    println("$Surname $name $patronymic, $age")

    Surname = "Сидорова"
    age = 22


    println("$Surname $name $patronymic, $age")

}