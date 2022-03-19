package app

fun main() {
    val mutableMap:MutableMap<String,String> = mutableMapOf()
    mutableMap.put("k2","Yoni") //mengubah atau menambah
    mutableMap["k1"] = "Yudi"


    for ((k,v)in mutableMap) {
        println("$k => $v")
    }

    println(mutableMap.clear())

    for ((k,v)in mutableMap){
        println("$k => $v")
    }
    println(mutableMap.getOrDefault("k1","tidak ada"))
}