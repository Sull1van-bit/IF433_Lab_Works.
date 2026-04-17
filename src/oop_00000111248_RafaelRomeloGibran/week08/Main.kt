package oop_00000111248_RafaelRomeloGibran.week08

fun main() {
    println("=== Test SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota tidak diketahui"
    println("Tujuan: $destination")

    println("=== Test Let Block ===")
    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalPrice?.let { price ->
        val tax = price * 0.1
        "Transaksi Valid. Harga Rp$price, Pajak Rp$tax"
    } ?: "Struk belanja: Harga belum diset"

    println(receipt)

    println("=== Test SAFE CASTING ===")
    val mixedData: List<Any> = listOf(
        "Smartphone",
        1500000,
        UserProfile("Andi", null),
        4500000.0
    )
}