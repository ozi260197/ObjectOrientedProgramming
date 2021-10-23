package data

// Outher Class
class Boss(val bossName: String) {

    // Inner Class
    inner class Employee(val name: String) {

        fun hi() {
            println("Hi!, my name is $name, and my boss name is ${this@Boss.bossName}")
        }

    }

}