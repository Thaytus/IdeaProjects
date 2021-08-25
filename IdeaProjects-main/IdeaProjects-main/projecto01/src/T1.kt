fun toIntegerr(s: String) {
    try {
        val value = s.toInt()
        println("The value is $value")
    } catch (ex: NumberFormatException) {
        println("The given string is non-numeric")
    }
}

fun main() {
    val s = "1024"
    toIntegerr(s)
    var r = 5+s.toInt()
    println(" r $r")
}