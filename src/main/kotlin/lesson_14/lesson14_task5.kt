package org.example.lesson_14

class Chat() {

    val setOfMasseges = mutableSetOf<Message>()
    fun addMessage(author: String, text: String) {
        setOfMasseges.add(Message((setOfMasseges.size + 1), author, text))

    }

    fun addThreadMessage(parentMessageId: Int, author: String, text: String) {
        setOfMasseges.add(ChildMessage((setOfMasseges.size + 1), author, text, parentMessageId))
    }

    fun printChat() {
        val allMessages = setOfMasseges.groupBy {
            if (it is ChildMessage) it.parentMessageId
            else it.id
        }
        allMessages.forEach {
            for (message in it.value) {
                if (message is ChildMessage) println("\t${message.author}: ${message.text}")
                else println("${message.author}: ${message.text}")
            }
        }
    }
}

open class Message(val id: Int, val author: String, val text: String) {

}

class ChildMessage(id: Int, author: String, text: String, val parentMessageId: Int) : Message(id, author, text) {

}

fun main() {
    val chat1 = Chat()

    chat1.addMessage("Коля", "415 база ответьте")
    chat1.addThreadMessage(1, "База", "Отвечаю")
    chat1.addMessage("Петя", "Го, я создал")
    chat1.addThreadMessage(1, "Небаза", "Не отвечаю")
    chat1.addThreadMessage(2, "Слава", "Го")

    chat1.printChat()
}