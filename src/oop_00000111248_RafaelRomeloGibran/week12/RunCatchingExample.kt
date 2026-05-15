package oop_00000111248_RafaelRomeloGibran.week12

fun main() {
    println("=== TEST RUNCATCHING ===")

    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
}