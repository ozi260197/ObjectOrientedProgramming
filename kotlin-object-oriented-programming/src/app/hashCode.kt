package app

import data.Company

fun main() {
    val company1 = Company("Ozi")
    val company2 = Company("Ozi")

    println(company1.hashCode())
    println(company2.hashCode())
//    println(company1.hashCode() == company2.hashCode()) false, standar bawaan kotlin

    // stelah implementasi hashCode() dirubah pada class company
    println(company1.hashCode() == company2.hashCode())
}