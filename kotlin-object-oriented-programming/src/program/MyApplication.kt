package program

import annotations.Fancy

// Menambahkan Annotation yang sudah dibuat

@Fancy(author = "Ozi")
class MyApplication(val name: String, val version: Int) {

    fun info(): String = "Application $name-$version"

}