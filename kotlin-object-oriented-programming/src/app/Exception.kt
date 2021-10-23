package app

import exception.ValidationException

fun validateAndSayhello(name: String) {
    if (name.isBlank()) {
        throw ValidationException("Name is blank")
    } else {
        println("Hello $name")
    }
}

fun main() {

    // Try : Akan menjalankan perogram dimana saat ada yang mengalami error, error itu akan di tangkap dan masuk ke blok catch
    // lalu perogram akan berhenti di barisan / perogram yang error nya

    // Multiple Catch, akan mengecek berdasarkan error nya apa, jika kita ingin menghandle sendiri jenis error nya juga bisa
    try {
        validateAndSayhello("Ozi")
        validateAndSayhello("")
        validateAndSayhello("Not Blank")
    }catch (error: ValidationException) {
        println("Terjadi error ${error.message}")
    }catch (error: Throwable){
        println("Terjadi error ${error.message}")
    }finally {
        println("Program selesai")
    }
    // Finally blok akan selalu di eksekusi

}