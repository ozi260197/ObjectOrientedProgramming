package app

import data.Student
import data.sayHello
import data.upperName

fun main() {
    val student = Student("Akhmad Fauzi", 24)

    // Akses extension function
    student.sayHello("Adinda Fatiharki")

    // Akses extension properties
    println(student.upperName)
}