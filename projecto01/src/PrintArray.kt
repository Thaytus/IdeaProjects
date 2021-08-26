import kotlin.collections.*
import kotlin.math.abs

fun main( args : Array<String>) {

    val lista = mutableListOf<Int>()

    for (i in 1..readLine()!!.toInt()) {
        val input = readLine()!!.split(" ").map { it.toInt() }
        println( "${input[0]}  ${input[1]} ")
    }
    println(       ("\n"))
}