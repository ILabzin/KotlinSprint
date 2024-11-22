package org.example.lesson_11

class Ingridient(val name: String, var count: Int) {
}

class Recept(val name: String) {
    val portion = 0
    val favourites = false
    val setIngridients = mutableSetOf<Ingridient>()
}

class Category(val name: String) {
    val setRecept = mutableSetOf<Recept>()

}