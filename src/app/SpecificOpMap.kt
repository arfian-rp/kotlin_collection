package app

fun main() {
    val data = mapOf(
        "a" to "Ito",
        "b" to "Desi",
        "c" to "Adi",
        "d" to "Loonaa",
    )
//    println(data.get("A"))//bawaan kalau tidak ada maka akan null
//    println(data.getValue("s"))//error jika tidak ada
    println(data.getOrElse("S"){"Ups"})
    println(data.getOrDefault("S","default"))
    println(data.filter { it.value.length>3 })
    println(data.filterKeys { it != "b" })
    println(data.filterValues { it.length > 3 })
}