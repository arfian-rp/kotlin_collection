package app

fun main() {
    //ordering random => mengacak data dalam colection (membuat collection baru )
    val num = (1..5).toList()
    println(num.shuffled())
    println(num.shuffled())
    println(num.shuffled())
}