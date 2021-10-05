package `if-else`

fun main(){
    val a = 42
    val b = 66
    val c = 24
    if(a > b && b > c){
        if(b > c){
            println(b)
        }
        else if(c > b){
            println(c)
        }
    }
    else if(b > c && b > a){
        if(c > a){
            println(c)
        }
        else if(a > c){
            println(a)
        }
    }
    else if(c > a && c > b){
        if(a > b){
            println(a)
        }
        else if(b > a){
            println(b)
        }
    }
}