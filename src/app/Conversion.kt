package app

fun main() {
    //semua function dimulai kata to, misal
    //toList(), toSet(), toMutableList(), dll
    val array = arrayOf(1,2,3,4,5)
    val range = 1..5
    val list = range.toList()
    val mutableList = array.toMutableList()
    val set = list.toSet()
    val mutableSet = list.toMutableSet()
    val sortedSet = list.toSortedSet()

    //https://www.youtube.com/watch?v=q5vNa9ekNzE&list=PL-CtdCApEFH-aC-35fw5qrr6DZ-qMzmRr&index=10
}