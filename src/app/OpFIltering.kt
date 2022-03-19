package app

fun main() {
    //filtering => menambahkan data dengan kondisi tertentu
     /*
     filter((T)->BOOLEAN) melakukan filter
     filterIndexed((index, T)->BOOLEAN) param index
     filterNot((T)->BOOLEAN) kebalikan filter
     filterIsInstance<T>() mengambil data instance dari T
     filterNotNull() mengambil data tidak null
      */

    val l1 = listOf("Adee","Edy","Ida")
    val l2 = l1.filter { it.length > 3 }
    println(l2)

    val l3 = listOf(null,1,"Budi","Desey",null)
    val l4 = l3.filterIsInstance<String>()
    println(l4)

    val l5 = l3.filterNotNull()
    println(l5)
}