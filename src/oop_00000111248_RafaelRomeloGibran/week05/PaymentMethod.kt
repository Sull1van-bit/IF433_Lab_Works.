package oop_00000111248_RafaelRomeloGibran.week05

abstract class PaymentMethod (val accountName: String) {
    abstract fun processPayment(amount: Double)
}