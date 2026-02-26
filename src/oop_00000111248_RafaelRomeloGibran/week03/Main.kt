package oop_00000111248_RafaelRomeloGibran.week03

fun main() {
    // Task 1
    val sword = Weapon("Excalibur")

    sword.damage = -50
    sword.damage = 9999

    println("Nama senjata: ${sword.name}")
    println("Damage: ${sword.damage}")
    println("Tier: ${sword.tier}")

    // Task 2
    val player = Player("Gogon")

    player.addXp(50)
    println("Level: ${player.level}")

    player.addXp(60)
    println("Level: ${player.level}")
}