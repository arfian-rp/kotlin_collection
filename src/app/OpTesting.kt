package app

fun main() {
    //testing => mengecek isi data collection
    /*
    any((T)->Boolean):Boolean mengecek apakh minimal ada 1 data sesuai kondisi
    none((T)->Boolean):Boolean mengecek apakh tidak ada 1 data sesuai kondisi
    all((T)->Boolean):Boolean mengecek apakh semua data sesuai kondisi
    any() apakh collection memiliki data
    none() apakh collection tidak memiliki data
     */

    val nilai = listOf(100,76,80)
    println(nilai.any { it > 70 })
    println(nilai.none { it > 70 })
    println(nilai.all { it > 70 })
    println(nilai.any())
    println(nilai.none())
}