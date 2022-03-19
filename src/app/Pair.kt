package app

fun main() {
    //pair => representasi data yang berpasangan
    val pair = Pair("Rudi","Udeen")
    println(pair.first)
    println(pair.second)

    val pair2:Pair<String,String> = "Yuda" to "Wahyu"
    println(pair2.first)
    println(pair2.second)
}