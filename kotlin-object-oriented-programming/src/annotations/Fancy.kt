package annotations

// Annotation ini hanya dapat ditambahkan di Class
@Target(AnnotationTarget.CLASS)

// Agar bisa dibaca oleh Reflection
@Retention(AnnotationRetention.RUNTIME)

// Bisa di dokumentasikan atau tidak?
// Kita pilih bisa
@MustBeDocumented()

annotation class Fancy(val author: String)
// Annotation tidak dapat memiliki members
// properties atau function didalam body nya