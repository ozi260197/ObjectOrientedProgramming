package app

import data.Student
import data.sayHello
import data.sayHelloNull

fun main() {
    val student = Student("Ozi", 24)
    student.sayHello("dinda")

    val nullSafeStudent= Student("ozi", 23)
    nullSafeStudent.sayHelloNull("Adinda")
}