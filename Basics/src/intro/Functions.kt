//@file:JvmName("KotlinUtil")
package intro

fun max(a:Int, b:Int):Int {
   return if(a>b) a else b
}

fun main() {
    println(max(5,8))

    println("The max is: ${max(5,8)}")

}