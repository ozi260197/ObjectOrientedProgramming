package app

import data.Manager
import data.VicePresident

fun main() {

    // Mengakses Class child nya
    val manager = Manager("Fauzi")
    manager.sayHello("bos")

    val vicePres = VicePresident("bos")
    vicePres.sayHello("Fauzi")

}