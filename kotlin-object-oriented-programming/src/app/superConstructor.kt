package app

import data.ExecutiveCustomer
import data.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Fauzi")
    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer("Fauzi", 1000000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)

}