package app

fun main() {
    /*
    elementAt(i) mengambil element pada i
    first() mengambil element pertama
    last() mengambil elemnet terakhir
    elementAtOrNull(i) mengambil element pada i, jika tidak ada akan mengembalikan null (tidak error)
    elementAtOrElse(i, default) apabila tidak ada mengembalikan default
     */

    val list = listOf("Wahyu","Lanee","Joko")
    println(list.first())
    println(list.last())
    println(list.elementAt(1))
    println(list.elementAtOrNull(10))
    println(list.elementAtOrElse(10){"kosong"})

    val set = setOf("Wahyu","Lanee","Joko") //set juga bisa
    println(set.first())
    println(set.last())
    println(set.elementAt(1))
    println(set.elementAtOrNull(10))
    println(set.elementAtOrElse(10){"kosong"})
}