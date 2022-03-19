package app

import data.Fruit

fun main() {
    val buahs = listOf(Fruit("Jeruk",29),Fruit("Apel",73),Fruit("Mangga",19))
    println(buahs.sortedBy { it.name })
    println(buahs.sortedByDescending { it.qty })
    println(buahs.sortedWith(compareBy{it.qty}))
    println(buahs.sortedWith(compareByDescending{it.qty}))
    println(buahs.sortedWith(Comparator{a,b->
        a.qty.compareTo(b.qty)
    }))
}