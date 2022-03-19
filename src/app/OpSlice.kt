package app


fun main() {
    //slice => mengambil sebagian element dgn param range
    val l1 = (0..10).toList()
    val l2 = l1.slice(0..4)
    val l3 = l1.slice(0..10 step 2)
    val l4 = l1.slice(10 downTo 3 step 2)

    println(l1)
    println(l2)
    println(l3)
    println(l4)
}
