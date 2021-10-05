package integers

fun main(){
    val n = 583
    val n1 = n / 100
    val n2 = (n / 10) % 10
    val n3 = n % 10
    //println(n1)
    //println(n2)
    //println(n3)
    println(n2*100 + n3*10 + n1)
}