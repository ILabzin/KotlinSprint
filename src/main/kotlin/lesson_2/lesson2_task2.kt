package org.example.lesson_2
fun main() {
    val worker = 50
    val intern = 30
    val workerRate = 30_000
    val internRate = 20_000

    val salaryWorker = worker * workerRate
    val salary = worker * workerRate + intern * internRate
    val mediumSalary = salary / (worker + intern)

    println(salaryWorker)
    println(salary)
    println(mediumSalary)

}

