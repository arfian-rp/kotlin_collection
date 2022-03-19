package app

fun main() {
    //Association => collection jadi map
    val l1 = listOf("Tyson1","Udeen22","Lanee333")
    val m1: Map<String, Int> = l1.associate { Pair(it,it.length) } //membentuk K & V type Pair
    val m2: Map<String, Int> = l1.associateWith { it.length+3 } //membentuk V saja
    val m3: Map<Int, String> = l1.associateBy { it.length } //membentuk K

    println(m1)
    println(m2)
    println(m3)
}