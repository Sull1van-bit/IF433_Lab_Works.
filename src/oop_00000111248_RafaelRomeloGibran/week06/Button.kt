package oop_00000111248_RafaelRomeloGibran.week06

class Button (override val name: String) : Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}