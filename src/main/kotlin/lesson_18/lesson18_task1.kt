package org.example.lesson_18

class ClientSystem {

   fun addItem ( numberOrder:Int,order:String ) {
       println("Заказан товар: $order")
   }
    fun addItem ( numberOrder:Int,order:MutableList<String> ) {
        println("Заказан товар: $order")
    }
}

fun main() {
    val clientSystem = ClientSystem()
    clientSystem.addItem(1,"Коробка")
    clientSystem.addItem(2, mutableListOf("ручка","карандаш"))
}