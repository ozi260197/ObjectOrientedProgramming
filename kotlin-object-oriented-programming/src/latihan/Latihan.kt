package latihan

import java.util.*

                // Properties in Primary Constructor
// Parent Class
open class Latihan(var name: String, var age: Int, var division: String) {

//   function extension
    fun String.txtBesar() = this.uppercase(Locale.getDefault())
    fun String.txtKecil() = this.lowercase(Locale.getDefault())

//  Initializer Blok
    init {
        println("data ${this.name} dibuat")
    }

//  behaviour/method say hello in Class
    open fun sayHello(name: String) {
        println("Hello ${name}, my name is ${this.name} ")
    }

//  function overloading
    fun sayHello(firstName: String, lastName: String) {
    println("Hello $firstName $lastName, my name is ${this.name} ")
}

}

// Child Class
class Person(name: String, age: Int, division: String) : Latihan(name, age, division) {
    override fun sayHello(name: String) {
        println("Hello bro $name, my Name is Person ${this.name}")
    }
}