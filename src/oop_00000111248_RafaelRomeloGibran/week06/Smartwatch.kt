package oop_00000111248_RafaelRomeloGibran.week06

class Smartwatch : Watch(), BluetoothConnectable, Rechargeable {
    override fun showTime() {
        println("Layar OLED menyala: 14:00 WIB")
    }

    override fun connectToBluetooth() {
        println("Mencari perangkat hp di sekitar...")
    }

    override fun chargeBattery() {
        println("Mengisi daya baterai smartwatch...")
    }
}