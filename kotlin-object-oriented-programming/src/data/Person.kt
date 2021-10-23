package data

class Person {

    // Properties untuk object
    var firstName: String = ""
    var middleName: String = ""
    var lastName: String = ""

    fun sayHello(name: String): Unit {
        println("Hello $name, my Name Is $firstName")
    }

    // Overloading function
    fun sayHello(name: String, age: Int): Unit {
        println("Hello $name, my Name Is $firstName and your age $age")
    }

    // this keyword untuk memanggil object properties pada class ini yg tertutup oleh parameter function
    fun sayHello(firstName: String, lastName: String) {
        println("Hello $firstName $lastName my name is ${this.firstName} ${this.lastName}")
    }

    fun run() {
        println("I'm Run")
    }

    fun getFullName(): String{
        return "$firstName $middleName $lastName"
    }

}