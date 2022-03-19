package app

import data.Person

fun main() {
    val mutableSet:MutableSet<Person> = mutableSetOf()
    mutableSet.add(Person("Kenzo"))
    mutableSet.add(Person("Kenzo"))
    mutableSet.add(Person("Panji"))
    mutableSet.addAll(mutableSetOf(
        Person("Udeen"), Person("Yudi"), Person("jamal")
    ))

    for (i in mutableSet){
        println(i)
    }
}