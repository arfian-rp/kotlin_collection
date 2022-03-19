package app

class Member(val name:String, val hobbies:List<String>)

fun main() {
    //flattening => mengubah nested collection jadi flat
    val l1 = listOf(
        listOf("Udeen","Beni","Adi"),
        listOf("Soni","Ida","Jamal"),
    )
    val l2 = l1.flatten()
    println(l2)

    val l3 = listOf(
        Member("Adi", listOf("Reading","Swimming")),
        Member("Yanto", listOf("Sport","Photograph")),
    )
    val hobbies = l3.flatMap { it.hobbies }
    println(hobbies)
}