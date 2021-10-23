package data

class Note(title: String) {
    var title = title

    // Definisikan getter
    get() {
        println("Call Getter Function")
        return field
    }
    // Definisikan Setter
    set(value) {
        println("Call Setter Function")
        if (value.isNotBlank()) {
            field = value
        } else {
            println("Invalid Title")
        }
    }
}

class BigNote(val title: String) {
    val bigTitle: String
    get() = title.toUpperCase()
}