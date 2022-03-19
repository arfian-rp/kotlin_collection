package app

fun main() {
    //default immutable
    //map bersifat value bol;eh duplikat tetapi kalau key duplikat maka an di replace

    val map:Map<String,String> = mapOf(
        "k1" to "Rudi",
        "k2" to "Ijul",
        Pair("k3","Wawan")
    )
    println(map.size)
    println(map.get("k1"))
    println(map["k2"])
    for( (key, value) in map){
        println("$key => $value")
    }
}