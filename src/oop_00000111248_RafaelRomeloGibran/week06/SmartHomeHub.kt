package oop_00000111248_RafaelRomeloGibran.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Perangkat [${device.name}] berhasil dihubungkan ke Hub.")
    }
}