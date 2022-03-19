package app

fun main() {
    //String representation => collection jadi string
    val name = listOf("Rahmad","Yudi","Pratama")

    println(
        name.joinToString(" ","<=", "=>") //separator, prefix, suffix
    )
    println(
        name.joinToString(" ","<=a", "a=>"){it.uppercase()} //separator, prefix, suffix, transform
    )
    val appendable = StringBuilder()
    name.joinTo(appendable, ",","<",">"){it.lowercase()}
    println(appendable.toString())
}