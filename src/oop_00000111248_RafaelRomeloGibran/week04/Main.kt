package oop_00000111248_RafaelRomeloGibran.week04

fun main() {
    println("Vehicle")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("Car")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\nElectricCar")
    val myElectricCar = ElectricCar("Tesla", 4, 85)
    myElectricCar.accelerate()
    myElectricCar.honk()
    myElectricCar.openTrunk()
}