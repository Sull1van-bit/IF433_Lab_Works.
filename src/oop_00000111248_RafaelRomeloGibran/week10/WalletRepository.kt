package oop_00000111248_RafaelRomeloGibran.week10

class WalletRepository<T : Any> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun find(predicate: (T) -> Boolean): List<T> {
        return items.filter(predicate)
    } // CHECKPOINT 14
}