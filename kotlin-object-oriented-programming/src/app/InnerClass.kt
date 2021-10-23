package app

import data.Boss

fun main() {
    // Cara mengakses Inner Class dan Outher Class

    // Buat Object Outher Class nya dulu yaitu Boss Class
    val boss1 = Boss("Fauzi")

    // Baru buat Object Untuk Class Inner nya, yaitu Class Employe
    val employee1 = boss1.Employee("Muhammad Zein")
    val employee2 = boss1.Employee("Adli Ilham")
    val employee3 = boss1.Employee("Adinda Fatiharki")

    val boss2 = Boss("Muhammad Zein")
    val employee4 = boss2.Employee("Adli Ilham")
    val employee5 = boss2.Employee("Adinda Fatiharki")

    employee1.hi()
    employee2.hi()
    employee3.hi()
    employee4.hi()
    employee5.hi()


}