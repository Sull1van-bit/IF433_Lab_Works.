package oop_00000111248_RafaelRomeloGibran.week08

object DatabaseMock {
    fun findUser(id: Int): UserProfile? {
        return if (id == 1) UserProfile("TestUser", "test@test.com") else null
    }
}

fun runMockUnitTest() {
    println("=== RUNNING UNIT TEST ===")
    val testUser = DatabaseMock.findUser(1)
    val initial = testUser!!.name.substring(0, 1)

    check(initial == "T") { "Test failed: Initial is Wrong"}
        println("Test passed: Initial is correct")
}