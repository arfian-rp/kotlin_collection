package app

fun main() {
    val l1 = listOf("a","b","a","b","c","d","c","d")
    val grouping:Grouping<String,String> = l1.groupingBy { it }
    println(grouping.eachCount())//menghitung jumlah total tiap grub
    println(grouping.fold(""){acc,i -> acc+i})//operasi fold
    println(grouping.reduce{key,acc,i -> acc+i})//operasi reduce
    println(grouping.aggregate{key, acc:String?, i, first -> //oprasi aggregate tiap group
        if(first) i
        else acc+i
    })
}