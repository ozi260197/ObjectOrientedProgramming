package app

import data.Rectangle
import data.Shape
import data.Triangle

fun main() {
    // Memanggil Class child nya
    val parentProperties = Rectangle()

    // Mengakses Properties Parent dari Class child nya
    val result = parentProperties.parentCorner
    println(result)

    val parentFunction = Triangle()
    parentFunction.printName()
}