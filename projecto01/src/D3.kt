import kotlin.collections.*
import kotlin.math.abs

fun main( args : Array<String>) {

    val lista = mutableListOf<Int>()

    for (i in 1..readLine()!!.toInt()) {
        val input = readLine()!!.split(" ").map { it.toInt() }
        println( mdc(input[0] , input[1]) )
    }
    println(       ("\n"))
}

 //máximo divisor comum (chamada recursiva)
fun mdc(n1: Int, n2: Int): Int {
     var resto = 1
     var v1 = n1
     var v2 = n2
     if (v1> v2) {
        resto = v2
        v2 = v1
        v1 = resto
    }
    resto = n1 % n2
   if (resto == 0){
        return abs(v1)
   }
   return mdc(n2,resto)
}