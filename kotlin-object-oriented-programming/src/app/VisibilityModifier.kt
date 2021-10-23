package app

import data.SuperTeacher
import data.Teacher

fun main() {
    val teacher = SuperTeacher("Akhmad fauzi")

    println(teacher.name)
    teacher.test()

//    teacher.teach() // Error, karena function visibility modifiers -> Private
}