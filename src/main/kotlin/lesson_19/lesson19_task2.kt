package org.example.lesson_19

enum class Category(val title: String) {
    FOOD("Еда"),
    CHEMISTRY("Химия"),
    OTHERS("Другое");

    fun getCategory(): String {
        return title
    }
}

class Product(val id: Int, val category: Category) {
    fun info() {
        println("$id принадлежит к категории \"${category.getCategory()}\"")
    }
}

fun main() {
    val product1 = Product(1, Category.FOOD)
    val product2 = Product(2, Category.CHEMISTRY)
    val product3 = Product(3, Category.OTHERS)

    product1.info()
    product2.info()
    product3.info()
}