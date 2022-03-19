package app

fun<T>displayIterable(iterable: Iterable<T>){
    val iterator = iterable.iterator()
    while (iterator.hasNext()) println(iterator.next())
}

fun main() {
    //iterbale => superclass dari Collection interface
    //iterable => general operation untuk melakukan iterasi seluruh data di collection, atau menghapus data di collection

    displayIterable(listOf("Panji","Yudi","Beni"))
    displayIterable(setOf("Panji","Yudi","Beni"))
}