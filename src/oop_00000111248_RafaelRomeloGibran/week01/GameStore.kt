package oop_00000111248_RafaelRomeloGibran.week01

import kotlin.math.roundToInt

fun main(){
    val userNote: String? = null
    val gameTitle: String = "Deadpool"
    val price: Int = 1000

    val finalPrice: Int = calculateDiscount(price)
    printReceipt(gameTitle, finalPrice)

    println("Harga Awal: $price")

    val pesan = userNote ?: "Tidak ada catatan"
    println("Catatan: $pesan")
}

fun calculateDiscount(price: Int): Int = if (price > 500000) price - (price * 0.2).roundToInt() else price - (price * 0.1).roundToInt()

fun printReceipt(title: String, finalPrice: Int) {

    println("judul: $title")
    println("Harga Akhir: $finalPrice")
}