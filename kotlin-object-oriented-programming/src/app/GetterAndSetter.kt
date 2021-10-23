package app

import data.BigNote
import data.Note

fun main() {
    val note = Note("Belajar Kotlin")

    // Memanggil fungsi get() getter
    println(note.title)

    // Memanggil fungsi setter
    note.title = ""

    // Memanggil fungsi get()
    println(note.title)

    val bigNote = BigNote("Belajar Kotlin")
    println(bigNote.title)
    println(bigNote.bigTitle)
}