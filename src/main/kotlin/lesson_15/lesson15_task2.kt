package org.example.lesson_15

abstract class WeatherStationStats

class Temperature() : WeatherStationStats()

class PrecipitationAmount() : WeatherStationStats()

class WeatherServer() {
    fun sendMail(weatherStationStats: WeatherStationStats) {
        if (weatherStationStats is Temperature) println("Говорим температуру")
        if (weatherStationStats is PrecipitationAmount) println("Говорим осадки")
    }
}

fun main() {
    val weatherServer = WeatherServer()
    val temperature = Temperature()
    val precipitationAmount = PrecipitationAmount()

    weatherServer.sendMail(temperature)
    weatherServer.sendMail(precipitationAmount)
}