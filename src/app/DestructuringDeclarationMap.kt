package app

fun main() {
    val m1 = mapOf(
        "a" to "Jaka",
        "b" to "Joko",
        "c" to "Jeki",
        "d" to "Eduardo",
    )

    for ((k,v) in m1) println("$k -> $v")
    m1.forEach{k,v -> println("$k -> $v")}
    m1.forEach{entry -> println("${entry.component1()} -> ${entry.component2()}")}
}