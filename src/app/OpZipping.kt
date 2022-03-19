package app


fun main() {
    //Zipping => menggabungkan dua buah collection
    val l1 = listOf("Putree","Putra","Yudee","Yuda")
    val l2 = listOf("Carles","Willem","Deandels")

    val l3: List<Pair<String,String>> = l1.zip(l2)
    println(l3)

    val l4: List<String> = l1.zip(l2) {i1, i2 ->
        "$i1 <=> $i2"
    }
    println(l4)

    //Unzip
    val pair = l3.unzip()
    println(pair)
}