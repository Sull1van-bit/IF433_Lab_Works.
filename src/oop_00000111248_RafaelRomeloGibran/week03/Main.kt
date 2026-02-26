package oop_00000111248_RafaelRomeloGibran.week03

fun main() {
    val e = Employee("Budi")

    // 1. Test validasi salary
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    // 2. Test encapsulation
    e.increasePerformance()

    // 3. Test computated property
    println("Pajak yang harus dibayar: ${e.tax}")
}