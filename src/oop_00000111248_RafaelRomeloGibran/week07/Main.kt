package oop_00000111248_RafaelRomeloGibran.week07

fun main() {
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")

    val uiMessage = when (response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
        ApiResponse.Loading -> "Tampilkan spinner"
    }

    println(uiMessage)
}