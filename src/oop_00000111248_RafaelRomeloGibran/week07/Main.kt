package oop_00000111248_RafaelRomeloGibran.week07

fun Main() {
    println("test singleton")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("Test object")
    val client = NetworkClient.createClient()
    client.connect()
}