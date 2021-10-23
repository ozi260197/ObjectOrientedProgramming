package app

import data.Person

fun main() {
    val ozi = Person()
    ozi.firstName = "Akhmad"
    ozi.lastName = "Fauzi"

    val zein = Person()
    zein.firstName = "Muhammad"
    zein.lastName = "Zein"


    val emon = Person()
    emon.firstName = "Muhammad"
    emon.middleName = "Adlli"
    emon.lastName = "Ilham"


    val eko = Person()
    eko.firstName = "Eko"
    eko.lastName = "Rahmadeni"


    println(ozi.firstName)
    println(zein.firstName)
    println(emon.firstName)
    println(eko.firstName)
}

