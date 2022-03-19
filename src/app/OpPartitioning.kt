package app

fun main() {
    //partitioning => membagi colection 2, yg masuk filtering dan engga
    val l1 = listOf("Yedi","Yudaa","Luneaaa")
    val (include, exclude) = l1.partition { it.length > 4 }
    println(include)
    println(exclude)
}