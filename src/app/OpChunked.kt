package app

fun main() {
    //chunked => operasi memotong collection menjadi beberapa collection
    val range = (1..20).toList()
    val l1 = range.chunked(10)
    val l2 = range.chunked(10){list:List<Int> ->
        var total = 0
        for(i in list) total+=i
        total
    }

    println(l1)
    println(l2)
}