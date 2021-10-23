package data

import java.util.*

object Utilities {
    var name: String = "My Utilities"

    fun toUpper(value: String): String {
        return value.uppercase(Locale.getDefault())
    }
}