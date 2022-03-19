package app

fun<T>displayCollection(collection:Collection<T>){
    for (i in collection) println(i)
}

fun main() {
    //Semua data collection adalah turunan dari interface Collection
    //Collection digunakan sebagai general operation terhadap structur data collection, seperti membaca menulis data collection

    displayCollection(listOf("Tony","Yudi","Udeen"))
    displayCollection(setOf("Tony","Yudi","Udeen"))
    displayCollection(mapOf("k1" to "Rudy").entries)
//    displayCollection(mapOf("k1" to "Rudy")) //error karena bukan collection


}