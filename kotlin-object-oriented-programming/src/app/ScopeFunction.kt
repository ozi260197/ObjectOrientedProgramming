package app

import data.Student

fun main() {
    val student = Student("Ozi", 24)

    // Scope function untuk bisa mengakses object dari Student
    val result1: String = student.let {
        // dalam blok lambda ini, kita bisa mengambil data nya menggunakan kata kunci it
        "Name ${it.name}, Age ${it.age}"
    }
    println(result1)

    // Student run hampir sama dengan let
    // Yang berbeda hanya kata kunci nya menjadi this
    val result2: String = student.run {
        "Name ${this.name}, Age ${this.age}"
    }
    println(result2)

    val result3: Student = student.apply {
        "Name ${this.name}, Age ${this.age}"
    }
    println(result3)

    val result4: Student = student.also {
        "Name ${it.name}, Age ${it.age}"
    }
    println(result4)

    val result5: String = with(student) {
        "Name ${this.name}, Age ${this.age}"
    }

    println(result5)
}