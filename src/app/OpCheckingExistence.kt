package app

fun main() {
    /*
    contains(e):Boolean mengecek apkh ada e didalam collection
    contains(Collection<T>):Boolean mengecek apkh ada Collection<T> didalam collection
    isEmpty():Boolean apakah collectionKosong
    isNotEmpty():Boolean kebalikan isEmpty()
     */

    val s1 = setOf(1,2,3,4,5)
    println(s1.contains(1))
    println(s1.containsAll(listOf(1,8,3)))
    println(s1.isEmpty())
    println(s1.isNotEmpty())
}