package data

// Inheritance

// This Parent Class
open class Employee(val name: String) {

    // meng override kan function untuk bisa di deklarasikan ulang ke dalam class child nya
    open fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }
}

// child Class
open class Manager(name: String) : Employee(name) {
    // Mendeklarasikan ulang function yang ada pada class parent

    // final override fun
    final override fun sayHello(name: String) {
        println("Hello $name, my name is Manager ${this.name}")
    }
}

class superManager(name: String) : Manager(name) {
    // ERROR karna function pada class extend manager bersifat final
//    override fun sayHello(name: String) {
//        println("Hello $name, my name is Super Manager ${this.name}")
//    }
}

class VicePresident(name: String) : Employee(name) {
    override fun sayHello(name: String) {
        println("Hello $name, my name is Vice President ${this.name}")
    }
}