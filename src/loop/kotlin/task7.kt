package loop.kotlin

fun main(){
    val n = 263
    val k = 10
    var chst = 0
    var ost = n

    while(ost>k){
        ost = ost - k
        chst+=1
    }
    println(chst)

}