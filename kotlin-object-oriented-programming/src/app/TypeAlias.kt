package app

import data.Application

// Mempersingkat nama Class atau nama apapun
typealias App = Application
typealias Aplikasi = App

// Type Alias untuk function lambda
typealias StringSupplier = () -> String

fun sayHello(supplier: StringSupplier) {
    println("Hello ${supplier()}")
}

fun main() {
    val app = App("Kotlin App")
    val aplikasi = Aplikasi("Kotlin Aplikasi")

    sayHello { "ozi" }
}