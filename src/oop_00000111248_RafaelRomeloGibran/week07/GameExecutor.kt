package oop_00000111248_RafaelRomeloGibran.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> println("Battle melawan: ${event.monsterName}")
        is BattleState.LootDropped -> println("loot: ${event.item.name} (${event.item.rarity})")
        is BattleState.GameOver -> println("Game Over: ${event.reason}")
        is BattleState.SafeZone -> println("Memasuki safe zone.")
    }
}