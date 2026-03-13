package oop_00000111248_RafaelRomeloGibran.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("Checkout")
    method.pay(amount)
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("==== TESTING CHECKOUT ====")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)
}