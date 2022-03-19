package app

import data.Buah

fun main() {
    //ordering natural => ordering secara otomatis
    //diurutkan dgn compareTo()
    val num = listOf(1,8,3,6,0,2,5)
    println(num.sorted())
    println(num.sortedDescending())

    val buahs = listOf(Buah(9030),Buah(7000),Buah(1588),Buah(8477))
    println(buahs.sorted())
    println(buahs.sortedDescending())
}