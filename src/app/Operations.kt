package app

fun main() {
    //foreach
    listOf(1,2,3,8).forEach{value -> println(value) }
    listOf(1,2,3,8).forEachIndexed{i,v -> println("$i -> $v") }
}