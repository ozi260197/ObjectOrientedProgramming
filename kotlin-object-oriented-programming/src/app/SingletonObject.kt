package app

import data.Application
import data.Utilities

fun main() {
    println(Utilities.name) // Memanggil properties
    println(Utilities.toUpper("Ozi")) // Memanggil function nya

    Utilities.name = "Diubah"
    a()
    b()


    println(Application.Companion.toUpper("Akhmad Fauzi"))
    println(Application.toUpper("Adinda Fatiharki"))
}

fun a() {
    println(Utilities.name)
}

fun b() {
    println(Utilities.name)
}