package data

import java.util.*

class Application(val name: String) {

    companion object{
        fun toUpper(name: String): String {
            return name.uppercase(Locale.getDefault())
        }
    }

}