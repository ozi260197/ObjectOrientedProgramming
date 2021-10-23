package data

open class Teacher(val name: String) {
    private fun teach() {
        println("Teach!")
    }

    protected open fun test() {
        println("Test")
    }
}

class SuperTeacher(name: String) : Teacher(name) {

    override public fun test() {
        super.test() // function test() masih dapat di akses, karena di akses pada class turunan nya dan menggunakan visibility modifiers -> Protected
    }

}