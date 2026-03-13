package oop_00000111248_RafaelRomeloGibran.week06

interface SmartDevice {
    abstract val id: String
    abstract val name: String
}

interface Switchable {
    abstract fun turnOn()
    abstract fun turnOff()
}

interface Recordable {
    abstract fun startRecord()
    fun stopRecord() {
        println("Perekaman dihentikan dan disimpan ke cloud.")
    }
}