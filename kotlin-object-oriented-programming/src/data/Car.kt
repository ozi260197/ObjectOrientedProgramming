package data

        // Primary constructor
class Car(paramBrand: String, paramName: String, paramYear: Int) {

    // Initializer Block
    // Program ini akan dibuat ketika object telah di buat
    init {
        println("Car $paramBrand dibuat")
    }

    // Constructor Secondary
    constructor(paramBrand: String, paramName: String) : this(paramBrand, paramName, 2021) {
        println("Secondary Constructor 1")
    }
    constructor(paramBrand: String) : this(paramBrand, "") {
        println("secondary Constructor 2")
    }

    val brand: String = paramBrand
    val name: String = paramName
    var year: Int = paramYear
}