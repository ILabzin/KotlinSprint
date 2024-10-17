package org.example.lesson_1

fun main () {
    val seconds: Int = 6480
    val hours: Int = seconds/3600
    val minute: Int = (seconds % (hours*3600))/60
    val sec: Int = seconds-hours*3600-minute*60
    println("0"+ hours + ":" + minute+":0" + sec)
}