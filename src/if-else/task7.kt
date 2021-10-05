package `if-else`

fun main(){
    val a = 41
    val b = 17
    val c = 53
    if(a < b && a < c){
        println(a)
    }
    else if(b < c && b < a){
        println(b)
    }
    else if(c < a && c < b){
        println(c)
    }
}