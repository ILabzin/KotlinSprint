package org.example.lesson_15

abstract class WeatherStationStats

class Temperature() : WeatherStationStats()

class PrecipitationAmount() : WeatherStationStats()

class WeatherServer() {
    fun sendMail(weatherStationStats: WeatherStationStats) {
        when (weatherStationStats) {
            is Temperature -> println("Говорим температуру")
            is PrecipitationAmount -> println("Говорим осадки")
        }
    }
}

fun main() {
    val weatherServer = WeatherServer()
    val temperature = Temperature()
    val precipitationAmount = PrecipitationAmount()

    weatherServer.sendMail(temperature)
    weatherServer.sendMail(precipitationAmount)
}