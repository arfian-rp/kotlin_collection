package app

fun main() {
    //fold & reduce => membuat aggregate secara manual
    val num = (1..100).toList()
    val max = num.reduce {acc,i ->
        if(acc<i)i
        else acc
    }
    val sum = num.fold(0){acc,i ->
        acc+i
    }
    println(max)
    println(sum)
}