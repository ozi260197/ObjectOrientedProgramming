package app

import data.HandPhone
import data.Laptop

// Bisa menerima data object apapun
fun printObject(any: Any) {
    // Kode Pengecekan using if expression
    if (any is Laptop) {
    // Smart Casts
        println("Laptop with name ${any.name}")
    } else if (any is HandPhone){
        // Smart Casts
        println("Handphone with name ${any.name}")
    } else {
        println(any)
    }

    // Kode check using when expression
    when (any) {
        is Laptop -> println("Laptop with name ${any.name}")
        is HandPhone -> println("Handphone with name ${any.name}")
        else -> println(any)
    }

}

fun printString(any: Any) {
    val value = any as String
    println(value)
}

fun printStringSafeNull(any: Any) {
    val value = any as? String
    println(value)
}

fun main() {
    printObject("Akhmad Fauzi")
    printObject(1)
    printObject(Laptop("Acer"))
    printObject(HandPhone("Samsung"))


    printString("Ozi")
//    printString(1) Error

    printStringSafeNull("ozi")
//    printStringSafeNull(1) Null
}