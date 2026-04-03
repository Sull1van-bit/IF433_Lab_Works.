package oop_00000111248_RafaelRomeloGibran.week07

fun main() {
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")

    val uiMessage = when (response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
        ApiResponse.Loading -> "Tampilkan spinner"
    }

    println(uiMessage)

    GameManager.startGame()
    GameManager.startGame()

    println("\nDrop Chance Legendary: ${ItemRarity.LEGENDARY.dropChance}%")

    val starterSword = Weapon.forgeStarterSword()
    println("Senjata Awal: ${starterSword.item.name}, Damage: ${starterSword.item.damage}")

    val upgradedItem = starterSword.item.copy(damage = 25)
    println("Senjata di-upgrade! Damage baru: ${upgradedItem.damage}")
}