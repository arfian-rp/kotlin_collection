package app

class Person(var age:Int){
    override fun toString(): String = "my age: ${this.age}."
}

fun main() {
    /*
    first((T)->Boolean) mengambil element pertama sesuai kondisi
    last((T)->Boolean) mengambil element terakhir sesuai kondisi
    firstOrNull((T)->Boolean) / find() mengambil element pertama sesuai kondisi, atau jika null tidak ada
    lastOrNull((T)->Boolean) / findLast() mengambil element terakhir sesuai kondisi, atau jika null tidak ada
     */

    val orangs = listOf<Person>(Person(19), Person(12), Person(84))
    println(orangs.first { it.age>17 })
    println(orangs.last { it.age>17 })
    println(orangs.find { it.age>17 }) //bisa null
    println(orangs.findLast { it.age>17 }) //bisa null
}