package app

fun<T>displayMutableListIterator(mutableListIterator:MutableListIterator<T>){
    while (mutableListIterator.hasNext()) println(mutableListIterator.next())
//    while (mutableListIterator.hasPrevious()) println(mutableListIterator.previous())
}

fun removeGanjil(mutableListIterator:MutableListIterator<Int>){
    while (mutableListIterator.hasNext()) if(mutableListIterator.next() % 2 == 1) mutableListIterator.remove()
}

fun main() {
    displayMutableListIterator(mutableListOf("A","B","C").listIterator())
    var angka = mutableListOf(1,2,3,4,5,6,7,8,9,10)
    removeGanjil(angka.listIterator())
    displayMutableListIterator(angka.listIterator())
}
