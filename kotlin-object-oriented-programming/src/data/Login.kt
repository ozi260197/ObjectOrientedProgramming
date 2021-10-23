package data

data class Login (val username: String, val password: String)

fun login(login: Login, callback: (Login) -> Boolean): Boolean {
    return callback(login)
}