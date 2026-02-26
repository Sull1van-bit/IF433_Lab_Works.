package oop_00000111248_RafaelRomeloGibran.week03

fun main() {
    val e = Employee("Budi")

    // 1. Test validasi salary
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    // 2. Test encapsulation
    e.increasePerformance()
    //e.performanceRating = 5

    // 3. Test computated property
    println("Pajak yang harus dibayar: ${e.tax}")
}