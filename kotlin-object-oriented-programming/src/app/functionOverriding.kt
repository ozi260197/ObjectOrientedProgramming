package app

import data.Manager
import data.VicePresident

fun main() {
    val manager = Manager("Dinda")
    manager.sayHello("boy")

    val vicePresident = VicePresident("Fauzi")
    vicePresident.sayHello("boy")
}