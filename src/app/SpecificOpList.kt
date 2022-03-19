package app

fun main() {
    val l1 = listOf("Odi","Lanee","Jamal","Ronald","Odi","Wahyuu","Yudi")
    println(l1.getOrElse(8){"index $it tidak ada"})
    println(l1.getOrNull(9))
    println(l1.subList(2,5))
    println(
        (1..99)
            .toList()
            .binarySearch(22)
    )
    println(l1.indexOf("Odi")) //mengambil index element yg sama dgn value
    println(l1.lastIndexOf("Odi")) //mengambil index element terakhir yg sama dgn value
    println(l1.indexOfFirst { it == "Odi" }) //mengambil index element yg sama dgn kondisi
    println(l1.indexOfLast { it == "Odi" }) //mengambil index element terakhir yg sama dgn kondisi
}