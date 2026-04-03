package oop_00000111248_RafaelRomeloGibran.week07

fun main() {
    println("test regular class")
    val data1 = DataUser("Rafael", 20)
    val reg2 = DataUser("Rafael", 20)
    println(data1)
    println("sama? ${data1 == reg2}")

    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")
    val (userName, userAge) = data1
    println("Destructured: $userName berumur $userAge")
}