package app

import data.Game
import data.Login
import data.login
import data.minMax

fun main() {
    val game = Game("HarvestMoon", 200_000)
    println(game)

    // Pemanggilan Destructuring variabel component dalam data class
    val (name, price) = game
    println(name)
    println(price)


    // Destructuring function
    val (min, max) = minMax(10, 100)
    println(min)
    println(max)

    // Destructuring Lambda Function
    val login = Login("ozi", "rahasia")
    login(login){ (username, password) ->
        username == "ozi" && password == "rahasia"
    }
}