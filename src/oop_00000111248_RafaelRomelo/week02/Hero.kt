package oop_00000111248_RafaelRomelo.week02

class Hero (val name: String, var hp: Int = 100, var baseDamage: Int) {

    fun attack (targetName: String) {
        println("$name menebas $targetName !")
    }

    fun isAlive(): Boolean {
        return hp > 0
    }

    fun takeDamage (damage: Int) {
        hp -= damage
        if (hp < 0) hp = 0

        println("$name menerima $damage damage, sisa HP: $hp")

        if (!isAlive()) {
            println("$name mati!")
        }
    }
}