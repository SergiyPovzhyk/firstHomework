package integers

fun main() {
    val n = 963
    val n1 = n / 100
    val n2 = (n / 10) % 10
    val n3 = n % 10
    println(n2*100 + n1*10 + n3)
}