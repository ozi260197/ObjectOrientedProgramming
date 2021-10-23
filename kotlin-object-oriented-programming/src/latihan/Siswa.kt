package latihan

import exception.ValidationException
import java.util.*

class MahaSiswa(val name: String, private val nim: String, private val jurusan: String) {

    fun getDataSiswa() {
        val jurusanAvailable: Array<String> = arrayOf(
            "informatika",
            "sistem informasi",
            "bisnis management",
            "psikologi",
            "teknik ilmu komputer",
            "akutansi"
        )

        when {
            nim.length != 12 -> throw ValidationException("Nim harus berisi 12 angka")
            !jurusanAvailable.contains(jurusan.lowercase(Locale.getDefault())) -> throw ValidationException("Tidak ada data jurusan")
            jurusanAvailable.contains(jurusan.lowercase(Locale.getDefault())) -> println(
                """
               
                Data Siswa 
                
                name    : $name
                nim     : $nim
                jurusan : $jurusan
            """.trimIndent()
            )
        }
    }


}