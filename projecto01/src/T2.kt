fun toInteger(s: String) {
    try {
        val value = s.toInt()
        println("The value is $value")
    } catch (ex: NumberFormatException) {
        println("The given string is non-numeric")
    }
}

fun main() {
    val s = "123"
    toInteger(s)
    var a = 5+s.toInt()
    println("The value is $a")
}