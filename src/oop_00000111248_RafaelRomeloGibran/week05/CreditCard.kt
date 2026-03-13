package oop_00000111248_RafaelRomeloGibran.week05

class CreditCard (val limit: Double, var usedAmount: Double = 0.0, accountName: String) : PaymentMethod (accountName) {
    override fun processPayment(amount: Double) {
        if (usedAmount + amount < limit) {
            usedAmount += amount
            println("Sukses!")
        } else {
            println("Transaksi ditolak")
        }
    }
}