package intro

fun main(args: Array<String>){
    val name = if(args.size > 0) args[0] else "Kotlin"

    println("Hello $name!")

    println("Hello im getting ${args.getOrNull(0)} from args")
}