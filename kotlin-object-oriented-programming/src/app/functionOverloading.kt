package app

import data.Person

fun main() {
    val person = Person()
    person.firstName = "Akhmad Fauzi"

    person.sayHello("dinda")

    // call function overloading
    person.sayHello("dinda", 22)
}