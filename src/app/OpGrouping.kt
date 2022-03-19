package app

fun main() {
    //grouping => uperasi meng-grubkan element di collection
    val l1 = listOf("a","a","b","b","c","c")
    val m1:Map<String, List<String>> = l1.groupBy { it }
    println(m1)
    val m2:Grouping<String,String> = l1.groupingBy { it }
    println(m2)
}