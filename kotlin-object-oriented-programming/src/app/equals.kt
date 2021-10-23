package app

import data.Company

fun main() {
    val company1 = Company("Ozi")
    val company2 = Company("Ozi")


    // default dari kotlin
//    println(company1 == company2) // false, karna object tersebut berbeda
//    println(company1 == company1) // true, kedua object tersebut sama
//    println(company2 == company2) // true, kedua object tersebut sama


    // setelah konversi menggunakan equals di dalam class company
    // meng-override function equals
    println(company1 == company2) // true, karna sudah dirubah pada equals function dalam Class Company
    println(company1 == company1)
    println(company2 == company2)

}