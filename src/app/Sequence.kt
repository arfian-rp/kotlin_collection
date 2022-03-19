package app

fun main() {
    //sequence => mengeksekusi operasi secara lazy (digunakan ketika data besar)
    val words = "the quick brown fox jumps over the lazy dog"
        .split(" ")
        .asSequence()

    val result = words
        .filter {
            println("filter $it")
            it.length > 3
        }
        .map {
            println("map $it")
            it.uppercase()
        }
        .take(4)

    println(result.toList())
}