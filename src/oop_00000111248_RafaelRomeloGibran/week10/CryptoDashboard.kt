package oop_00000111248_RafaelRomeloGibran.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 1.25))
    coinRepo.add(Coin("ETH", 15.0))
    coinRepo.add(Coin("USDT", 250.0))
}