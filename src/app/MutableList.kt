package app

fun main() {
    var mutableList:MutableList<String> = mutableListOf()
    mutableList.add("Yahya")
    mutableList.add("Kemy")
    mutableList.add("Wahyu")
    println(mutableList[0])
    println(mutableList[1])
    println(mutableList[2])
    mutableList[0] = "Budi"
    mutableList.set(1,"Udin")
    mutableList.removeAt(2)
    for(i in mutableList){
        println(i)
    }
}