package app

import data.Employee
import data.Manager
import data.VicePresident

fun main() {
    var employe: Employee = Employee("Ozi")
    employe.sayHello("Dinda")

    // Perubahan bentuk
    // Behaviour nya pasti berubah
    employe = Manager("Dinda")
    employe.sayHello("Ozi")

    employe = VicePresident("Akhmad Fauzi")
    employe.sayHello("Zein")
}