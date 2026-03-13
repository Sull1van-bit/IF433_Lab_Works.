package oop_00000111248_RafaelRomeloGibran.week06

class Gopay: PaymentMethod {
    override fun pay(amount: Double) { println("Processing Rp$amount via Gopay") }
}

class CreditCard: PaymentMethod {
    override fun pay(amount: Double) { println("Contacting Bank for Rp$amount") }
}