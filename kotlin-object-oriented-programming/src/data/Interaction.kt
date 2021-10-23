package data

interface Interaction {
    val name: String

    // Concreate function
    fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }
}

// Multiple Inheritance Interface Parent
interface Go : Interaction {
    fun go(){
        println("Go!")
    }
}

// Kode Konflik pada Interface
interface MoveA {
    fun move() = println("Move A")
}
interface MoveB {
    fun move() = println("Move B")
}

// Implementation multiple Inheritance Interface Parent in Child Class Human
class Human(override val name: String) : Go, MoveA, MoveB {

    // Jika function dalam function belum di deklarasi didalam Interface
    // Kita bisa Meng-override nya di dalamm class turunan nya / Child Class

//    override fun sayHello(name: String) {
//        println("Hello $name, my name is ${this.name}")
//    }

    // Cara memperbaiki konflik nya
    override fun move() {

        super<MoveA>.move()
        super<MoveB>.move()

        // memanggil Interface nya <MoveA>
        // Memanggil function nya move()
    }

}

//  Todo: Super Class hanya boleh satu
//  Todo: Super Interface boleh lebih dari satu

// Todo: Class bisa extend ke Interface
// Todo: Tapi Interface tidak bisa extend ke Class