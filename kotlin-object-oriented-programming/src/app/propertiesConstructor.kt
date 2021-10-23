package app

import data.User

fun main() {
    val user1 = User("afauzi", "password")
    val user2 = User("afatiharki", "rahasia")

    println("Username: ${user1.userName} | Password: ${user1.password}")
    println("Username: ${user2.userName} | Password: ${user2.password}")
}