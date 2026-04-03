package oop_00000111248_RafaelRomeloGibran.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}