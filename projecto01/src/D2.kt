import kotlin.math.pow
fun main() {
    val est = 1
    //println("Digite um varlo Maior que 1 e Menor que 1000")
    val n = 1..(readLine() ?: "5").toInt()
    n.forEach {
        println("$it ${(it.toDouble().pow(2)).toInt()} ${(it.toDouble().pow(3)).toInt()}")
        println("$it ${(it.toDouble().pow(2)).toInt().plus(1)} ${(it.toDouble().pow(3)).toInt().plus(1)}")
    }
}