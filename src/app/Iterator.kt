package app

fun<T>displayListIterator(listIterator:ListIterator<T>){
    while (listIterator.hasNext()) println(listIterator.next())
    while (listIterator.hasPrevious()) println(listIterator.previous())
}

fun main() {
    //Iterator memilik child interface yaitu:
    //ListIterator => List
    //MutableListIterator => MutableList
    //set tetap pakai Iterator
    //map tidak mendukung Iterator
    displayListIterator(listOf("Yudi","yuda","Yudo").listIterator())
}

