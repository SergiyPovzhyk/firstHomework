package loop.kotlin

fun main(){
    val a = 35
    val b = 50
    var sum = 0
    for (i in a..b){
        sum = sum + i
        println(sum)
    }
}