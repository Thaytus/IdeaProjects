import kotlin.collections.*
import kotlin.math.*

fun main() {
    var a = 259
    var b = 111
    var c = 1
    if (a > b){
        c = b
        b = a
        a = c
    }
        c = b%a
    var bs = abs(b)

    println(" c $c")
    println(" bs $bs")
}