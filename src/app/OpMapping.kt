package app

fun main() {
    /*
    map() mengubah collection menjadi collection baru
    mapIndexed() sama tp dengan tambahan param Index
    mapNotNull() sama sprt map(), namun menghirauklan hasil null
    mapIndexedNotNull() sama sprt mapNotNull(), tambahakan param index
     */

    val l1 = listOf("Arfian","Yuda","Yudi")
    val l2 = l1.map { i -> i.uppercase() }
    l2.forEach {i -> println(i)}

    val l3 = l1.map{i -> i.length}
    l3.forEach {i -> println(i)}
    val l4 = l1.mapNotNull { v ->
        if (v == "Yudi") v else null
    }
    l4.forEach{i -> println(i) }


    val m1 = mapOf(
        1 to "Yudi",
        2 to "Yuda",
        3 to "Eka",
    )
    val m2 = m1.mapKeys { it.key*10 } //mengubah map jadi map baru dengan nilai key baru sesuai lamda
    val m3 = m1.mapValues { it.value.uppercase() } // mengubah map jadi map baru dengan nilai value sesuai lamda
}