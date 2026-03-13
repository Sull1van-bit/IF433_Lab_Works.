package oop_00000111248_RafaelRomeloGibran.week05

fun main() {
    val wallet = EWallet("Rafael", 50000.0)
    val card = CreditCard(100000.0, 0.0, "Rafael")

    val listPaymentMethod: List<PaymentMethod> = listOf(wallet, card)

    for (payment in listPaymentMethod) {
        when (payment) {
            is EWallet -> {
                wallet.topUp(50000.0)
            }
        }
        payment.processPayment(75000.0)
    }
}