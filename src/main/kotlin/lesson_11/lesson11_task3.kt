package org.example.lesson_11

val statusMap: Map<String, String> =
    mapOf("Speake" to "разговаривает", "Silence" to "Микрофон выключен", "Mute" to "Пользователь заглушен")

class User3(
    val userAvatar: String, // Здесь имитация, как сейчас по крайней мере понимаю это надо хранить
    // картинку в drawable, к ней обратиться и присвоить ей переменную, но не хотелось что бы ошибка горела
    val userName: String,
) {
    var statusUser: String = ""

}

class Room(
    val cover: String,//Обложка комнаты
    val roomName: String
) {
    val userInRoom: MutableSet<User3> = mutableSetOf()

    fun addUser(user: User3) {
        userInRoom.add(user)
    }

    fun changeUserStatus(nameUser: String, newStatus: String) {
        userInRoom.forEach {
            if (it.userName == nameUser) {
                it.statusUser = newStatus
            }
        }
    }
}

fun main() {
    val room1 = Room("Красивая обложка", "Любители фильмов")
    val newUser = User3("Аватар", "ШокерФейс")
    room1.addUser(newUser)
    room1.changeUserStatus("Аватар", statusMap.get("Silence").orEmpty())
}