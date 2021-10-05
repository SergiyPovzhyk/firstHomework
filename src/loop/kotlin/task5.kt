package loop.kotlin

fun main(){
    val a = 9
    var fact = 1
    for(i in 1..a){
        fact = fact*i
        println(fact)
    }
}