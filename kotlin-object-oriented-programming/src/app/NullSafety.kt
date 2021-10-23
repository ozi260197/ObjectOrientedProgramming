package app

data class Friend(val name: String)

fun sayHello(friend: Friend?) {

//    println("Hello ${friend?.name}")

    // Pengecekan null
//    if (friend != null){
//        println("Hello ${friend.name}")
//    }

    // Elvis Operator
    // Jika dia null, maka akan di tambahkan suatu ekspresi
    // yaitu helo Friend (default   )
//    val name = friend?.name ?: "Friend"
//    println("Hello $name")

    // Kalo datanya tidak null, Aman
    // Kalo data nya null , Error
    val name = friend!!.name
    println("Hello $name")
}

fun main() {
    sayHello(Friend("Ozi"))

    sayHello(null) // Error
}