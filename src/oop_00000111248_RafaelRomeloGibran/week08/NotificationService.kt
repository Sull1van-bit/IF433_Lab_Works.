package oop_00000111248_RafaelRomeloGibran.week08

class NotificationService {
    fun sendEmail(emailadress: String) {
        println("Mengirim email ke $emailadress")
    }

    fun processUser(user: UserProfile) {
        // sendEmail(user.email) // Error: type mismatch

        if (user.email != null) {
            sendEmail(user.email)
        } else {
            println("User ${user.name} tidak memiliki email.")
        }
    }
}