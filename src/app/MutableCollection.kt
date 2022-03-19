package app

fun<T>displayMutableCollection(collection:Collection<T>){ //MuttableCollection adalah turunan Collection
    for (i in collection) println(i)
}

fun main() {
    //Semua data collection adalah turunan dari interface Collection
    //Collection digunakan sebagai general operation terhadap structur data collection, seperti membaca menulis data collection

    displayMutableCollection(mutableListOf("Tony","Yudi","Udeen"))
    displayMutableCollection(mutableSetOf("Tony","Yudi","Udeen"))
    displayMutableCollection(mutableMapOf("k1" to "Rudy").entries)
//    displayCollection(mutableMapOf("k1" to "Rudy")) //error karena bukan collection


}