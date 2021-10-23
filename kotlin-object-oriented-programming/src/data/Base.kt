package data

interface Base {
    fun sayHello(name: String)
}

// Kode Delegate Manual
class MyBase : Base {
    override fun sayHello(name: String) {
        println("Hello $name")
    }
}

// Kode Delegation otomatis
class MyBaseDelegate(val base: Base) : Base by base