package app

class Application(map:Map<String,Any>){
    val name:String by map
    val version:Int by map
}

fun main() {
    val app = Application(mapOf(
        "name" to "WATSAP",
        "version" to 1.0
    ))
    println(app.name)
    println(app.version)
}