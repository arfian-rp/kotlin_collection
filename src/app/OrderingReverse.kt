package app

fun main() {
    //orderiong reverse =? urutan data terbalik
    val l1 = (1..7).toMutableList()
    val listReverse1 = l1.reversed() //membuat collection baru (terpisah dgn collection yg lama)
    val listReverse2 = l1.asReversed() //membuat view terhadap collection dengan urutan terbalik
    l1.add(8)
    println(listReverse1)
    println(listReverse2) //ikut berubah
}