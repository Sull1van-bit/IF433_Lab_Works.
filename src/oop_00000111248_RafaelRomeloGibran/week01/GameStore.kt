package oop_00000111248_RafaelRomeloGibran.week01

import kotlin.math.roundToInt

fun main(){
    val gameTitle: String
    val price: Int


}

fun calculateDiscount(price: Int): Int = if (price > 500000) price - (price * 0.2).roundToInt() else price - (price * 0.1).roundToInt()