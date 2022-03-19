package app

fun main() {
    val num1 = (1..10).toSet()
    val num2 = (6..15).toSet()
    println(num1 union num2) //mengembalikan semua
    println(num1 intersect num2) //mengembalikan semua yg terdapat di kedua
    println(num1 subtract num2) //mengembalikan element yg tidak dimiliki set(num2)
    println(num2 subtract num1)

}