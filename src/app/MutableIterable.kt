package app

fun<T>displayMutableIterable(iterable: MutableIterable<T>){
    val iterator = iterable.iterator()
    while (iterator.hasNext()) println(iterator.next())

}

fun main() {
    //tambahan method remove()

    displayMutableIterable(mutableListOf("Panji","Yudi","Beni"))
    displayMutableIterable(mutableSetOf("Panji","Yudi","Beni"))
}