package oop_00000111248_RafaelRomeloGibran.week08

fun main() {
    println("=== Test SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota tidak diketahui"
    println("Tujuan: $destination")
}