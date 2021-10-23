package data

import kotlin.properties.Delegates

class Account(description: String = "This Old Value") {
    val name: String by lazy {
        println("Name is called")
        "Ozi"
    }

    // Kode Obervable properties
    var description: String by Delegates.observable(description) {
        property, oldValue, newValue ->
            println("${property.name} is changed from $oldValue to $newValue")
    }
}