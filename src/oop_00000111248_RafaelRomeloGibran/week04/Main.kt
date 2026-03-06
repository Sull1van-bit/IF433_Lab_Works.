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

    val employee = Employee("Rafael", 5000)
    employee.work()
    println("Bonus: ${employee.calculateBonus()}")

    val manager = Manager("Gibran", 8000)
    manager.work()
    println("Bonus: ${manager.calculateBonus()}")

    val developer = Developer("Andi", 6000, "Python")
    developer.work()
    println("Bonus: ${developer.calculateBonus()}")
}