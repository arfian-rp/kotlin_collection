package app

import data.Person

fun main() {
    //default => immutable
    //set bersifat dinamis, tidak urut, tidak duplikat,
    val set:Set<Person> = setOf(
        Person("Yudi"),Person("Yudi"), Person("Wahyu")
    )
    println(set.size)
    println(set.contains(Person("Wahyu")))
    for (person in set){
        println(person)
    }
}