package org.example.lesson_11

class Forum(var count: Int = 1) {
    val setUser = mutableSetOf<ForumMember>()
    val forum = mutableSetOf<ForumMessage>()

    fun createNewUser(name: String): ForumMember {
        val newUser = ForumMember(count, name)
        count++
        setUser.add(newUser)
        return newUser
    }

    fun createNewMessage(userId: Int) {
        var text: String
        setUser.forEach {
            if (it.userId == userId) {
                text = readln()
                forum.add(ForumMessage(userId, text))
                return
            }
        }
    }

    fun printThread() {
        forum.forEach {
            var id = it.authorId
            var name: String = ""
            setUser.forEach {
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