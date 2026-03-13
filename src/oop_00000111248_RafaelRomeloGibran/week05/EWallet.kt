package oop_00000111248_RafaelRomeloGibran.week05

class EWallet (accountName: String, var balance: Double) : PaymentMethod (accountName) {
    override fun processPayment(amount: Double) {
        if (balance < amount) {
            println("Saldo tidak cukup")
        } else {
            balance -= amount
        }
    }

    fun topUp(amount: Double) {
        balance += amount
    }
}