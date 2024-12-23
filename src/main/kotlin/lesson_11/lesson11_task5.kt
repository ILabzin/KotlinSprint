package org.example.lesson_11

class Forum {
    var count: Int = 1
    val users = mutableSetOf<ForumMember>()
    val masseges = mutableSetOf<ForumMessage>()

    fun createNewUser(name: String){
        val newUser = ForumMember(count, name)
        count++
        users.add(newUser)
    }

    fun createNewMessage(userId: Int) {
        var text: String
        users.forEach {
            if (it.userId == userId) {
                text = readln()
                masseges.add(ForumMessage(userId, text))
                return
            }
        }
    }

    fun printThread() {
        masseges.forEach {
            var id = it.authorId
            var name: String = ""
            users.forEach {
                if (it.userId == id) name = it.userName
            }
            println("${name} : ${it.message}")
        }
    }
}

class ForumMember(
    val userId: Int,
    val userName: String,
)

class ForumMessage(
    val authorId: Int,
    val message: String,
)

fun main() {
    val forum = Forum()
    forum.createNewUser("Петя")
    forum.createNewUser("Вася")
    forum.createNewMessage(1)
    forum.createNewMessage(2)
    forum.createNewMessage(3)

    forum.printThread()
}