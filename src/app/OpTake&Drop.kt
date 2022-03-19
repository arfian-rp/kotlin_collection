package app

fun main() {
    //take n drop => mengambil sebagian element di collection
    /*
    take(n) mengambil colection diawal sejumlah n
    takeLast(n) mengambil collection diakhir sejumlah n
    takeWhile((T) -> Boolean) mengambil element diawal selama kondisi true
    takeWhileLast((T) -> Boolean) mengambil element diakhir selama kondisi true


    drop(n) menghapus colection diawal sejumlah n
    dropLast(n) menghapus collection diakhir sejumlah n
    dropWhile((T) -> Boolean) menghapus element diawal selama kondisi true
    dropWhileLast((T) -> Boolean) menghapus element diakhir selama kondisi true
     */

    val chars = ('a'..'z').toList()
    println(chars.take(3))
    println(chars.takeWhile { it<'f' })
    println(chars.takeLast(2))
    println(chars.takeLastWhile { it>'w' })

    println(chars.drop(33))
    println(chars.dropLast(23))
    println(chars.dropWhile { it<'x' })
    println(chars.dropLastWhile { it>'c' })

}
