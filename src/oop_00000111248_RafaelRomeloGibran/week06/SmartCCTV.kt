package oop_00000111248_RafaelRomeloGibran.week06

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("CCTV '$name' diaktifkan")
        startRecord() // Memanggil fungsi record secara otomatis
    }

    override fun turnOff() {
        println("CCTV '$name' dinonaktifkan")
        stopRecord()
    }

    override fun startRecord() {
        println("CCTV '$name' mulai merekam")
    }
}