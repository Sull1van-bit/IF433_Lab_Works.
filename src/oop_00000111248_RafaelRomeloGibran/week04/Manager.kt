package oop_00000111248_RafaelRomeloGibran.week04

open class Manager(name: String, Salary: Int): Employee(name, Salary) {
    override fun work() {
        println("$name sedang memimpin rapat divisi.")
    }

    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500000
    }
}