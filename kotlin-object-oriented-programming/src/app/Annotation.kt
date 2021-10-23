package app

import data.Application
import program.MyApplication

fun main() {
    val myApplication = MyApplication("Kotlin", 1)
    println(myApplication.info())

}