package app

fun main() {
    val num = (1..100).toList()
    println(num.average())
    println(num.sum())
    println(num.sumBy { it/2 })
}