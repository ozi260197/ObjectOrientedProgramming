package data

open class Shape {
    open val corner: Int = -1

    open fun printName() {
        println("This is Shape")
    }
}

class Rectangle : Shape() {

    // Untuk membuka override properties nya untuk dibuat ulang di class child nya
    // buka dengan kata kunci open pada properties parent nya
    override val corner: Int = 4

    // Super Properties
    // kata kunci super untuk bisa mengakses properties milik Parent nya
    val parentCorner: Int = super.corner
}

class Triangle : Shape() {
    override val corner: Int = 3

    // Super Function
    // Mengakses method Class Parent didalam Class Child
    override fun printName() {
        println("This is Rectangle")
        super.printName()
    }
}

// beda dari function override
// properties override defaultnya adalah final
