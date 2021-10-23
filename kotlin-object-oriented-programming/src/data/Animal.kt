package data

abstract class Animal {
    // Properties abstract class
    abstract val name: String // inisialisasi wajib di class turunan nya
    abstract fun run()

    // Masing masing properties di inisialisasikan hanya pada class turunan nya
}

class Cat : Animal() {
    override val name: String = "Hiro"
    override fun run() {
        println("Name Cat is a $name")
        println("$name run")
    }
}

class Dog : Animal() {
    override val name: String = "Bruno"
    override fun run() {
        println("Name Dog is a $name")
        println("$name Run")
    }

}