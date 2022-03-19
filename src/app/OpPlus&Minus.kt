package app

fun main() {
    val l1 = listOf("Yogi","Putra","Hermawan")
    val l2 = l1 + "Yudi"
    val l3 = l2 + listOf("Tyfany","Lanee","Popy")
    println(l3)
    val l4 = l3 - listOf("Putra","Popy")
    println(l4)

    val m1 = mapOf("a" to "Udeen","b" to "Yogi")
    val m2 = m1 + ("c" to "Hendra")
    val m3 = m2 - "a"
    val m4 = m3 + mapOf("d" to "Adi","e" to "Yudha")
    println(m4)
}