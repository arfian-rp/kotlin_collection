package app

import com.sun.jdi.connect.spi.TransportService.ListenKey

fun main() {
    //default => immutable
    //list bersifat dinamis, urut, boleh duplikat
    val list:List<String> = listOf("Adi","Yuda","Lani")
    println(list.isEmpty())
    println(list.isNotEmpty())
    println(list.size)
    println(list[0])
    println(list[1])
    println(list[2])
    println(list.indexOf("Adi"))
    println(list.contains("Yuda"))
    println(list.contains("Yudi"))
    println(list.containsAll(listOf("Yuda","Lani")))
}