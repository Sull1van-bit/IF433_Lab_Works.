package oop_00000111248_RafaelRomeloGibran.week04

open class Developer(name: String, Salary: Int, val programmingLanguage: String): Employee(name, Salary) {
    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }
}