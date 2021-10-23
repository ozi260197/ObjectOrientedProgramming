package data

            // Properties di Constructor
class User(var userName: String, var password: String) {

                // Untuk mengubah Representasi toString didalam class User
                override fun toString(): String {
                    return "User with username = $userName"
                }

}