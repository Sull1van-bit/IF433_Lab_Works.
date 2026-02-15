package oop_00000111248_RafaelRomelo.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan judul buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan nama peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan durasi peminjaman (dalam hari): ")
    var loanDuration = scanner.nextInt()

    if (loanDuration <= 0) {
        println("Durasi peminjaman tidak boleh minus atau nol. Durasi diatur menjadi 1 hari.")
        loanDuration = 1
    }

    val b1 = Loan(bookTitle, borrower, loanDuration)
    println("Buku '${b1.bookTitle}' dipinjam oleh ${b1.borrower}")
    println("Durasi peminjaman: ${b1.loanDuration} hari")
    println("Denda yang harus dibayar: Rp${b1.calculateFine()}")
}