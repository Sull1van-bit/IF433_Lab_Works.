package oop_00000111248_RafaelRomeloGibran.week04

open class Employee(val name: String, val baseSalary: Int) {

    open fun work() {
        println("$name Sedang bekerja.")
    }

    open fun calculateBonus(): Int {
        return baseSalary * 10 / 100
    }
}