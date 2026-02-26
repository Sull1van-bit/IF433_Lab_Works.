package oop_00000111248_RafaelRomeloGibran.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val enemyName = "Bahlil"
    var enemyHp = 100

    print("Masukkan nama hero: ")
    val name = scanner.nextLine()

    print("Masukkan base damage hero: ")
    val damage = scanner.nextInt()

    val hero = Hero(name, 100, damage)

    var action = 0

    while (hero.isAlive() && enemyHp > 0) {
        println("1. Attack 2. Kabur")
        print("Pilih action: ")
        action = scanner.nextInt()

        when (action) {
            1 -> {
                hero.attack(enemyName)
                enemyHp -= hero.baseDamage
                if (enemyHp > 0) {
                    println("$enemyName menerima ${hero.baseDamage} damage, sisa HP: $enemyHp")
                    var enemyDamage = (10..20).random()
                    println("$enemyName mengayunkan pohon sawit ke ${hero.name}!")
                    hero.takeDamage(enemyDamage)
                } else {
                    println("$enemyName mati!")
                }
            }
            2 -> {
                println("${hero.name} kabur dari pertarungan!")
                break
            }
            else -> println("Action tidak valid!")
        }
    }

    if (!hero.isAlive()) {
        println("${hero.name} kalah dalam pertarungan!")
    } else if (enemyHp <= 0) {
        println("${hero.name} menang dalam pertarungan!")
    }

}