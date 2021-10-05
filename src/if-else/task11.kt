package `if-else`

fun main(){
    //var f = 0
    val x : Float = 1.2F
    if(x<=0){
        println(-x)
    }
    else if(x > 0 || x < 2){
        println(x*x)
    }
    else if(x>=2){
        println(4)
    }
}