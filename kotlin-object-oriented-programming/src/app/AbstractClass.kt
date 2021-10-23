package app

import data.City
import data.Country
import data.Location

fun main() {
    // Error, karna abstract class tidak bisa langsung di definisikan
//    val location = Location("Bekasi")

      // Deklarasi Class Abstract didalam class child nya
    val city = City("Bekasi")
    val country = Country("Indonesia")

    println(city.name)
    println(country.name)

}