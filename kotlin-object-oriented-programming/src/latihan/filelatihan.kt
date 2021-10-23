package latihan

fun main() {

    extension("Initializer block saat membuat object")
    // Akses class parent
    val person1 = Latihan("Akhmad fauzi", 24, "Software Enginner")

    // Akses Class child
    val person2 = Person("Adinda Fatiharki", 22, "Product Designer")
    val person3 = Person("Muhammad Zein", 26, "Staff Marketing")

    extension("Class child override function")
    // call Class child override function
    person2.sayHello("doni")

    extension("Call properties Constructor")
    // Call properties Constructor
    println("Name: ${person1.name} | Age: ${person1.age} | Division: ${person1.division}")
    println("Name: ${person2.name} | Age: ${person2.age} | Division: ${person2.division}")
    println("Name: ${person3.name} | Age: ${person3.age} | Division: ${person3.division}")

    extension("Behaviour methode in Class")
    // Call Behaviour methode in Class Latihan
    person1.sayHello("Joni")

    extension("Call function Overloading")
    // Call function overloading
    person1.sayHello("Abu", "Dabi")

}

fun extension(message: String) {
    println()
    println("Ini Hasil $message")
}