package app

import data.Product

fun main() {
    val product = Product("Indomie", 3_000, "Makanan")

    // Copy Data Class
    val product2  = product.copy( name = "Supermi")
    println(product)
    println(product2)
}