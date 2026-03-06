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

    println("\nManager")
    val manager = Manager("Rafael", 10000000)
    manager.work()
    println("Bonus: ${manager.calculateBonus()}")

    println("\nDeveloper")
    val developer = Developer("Gibran", 8000000, "Swift")
    developer.work()
    println("Bonus: ${developer.calculateBonus()}")
}