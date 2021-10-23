package app

import data.Person

fun main() {
    val person = Person()
    person.firstName = "Akhmad"
    person.middleName = "Fauzi"

    person.sayHello("Dinda")

    val fullName = person.getFullName()
    println("Fullname is $fullName")

    person.run()
}