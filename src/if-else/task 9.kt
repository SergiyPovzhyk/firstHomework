package `if-else`

fun main(){
    val a = 58
    val b = 42
    val c = 170
    if(a > b && c > b){
        println(a + c)
    }
    else if(b > a && c > a){
        println(b + c)
    }
    else if(a > c && b > c){
        println(a + b)
    }
}