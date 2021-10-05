package chars

fun main(){
    val str = "248"
    var num = 0
    for(char in str){
        num +=char.digitToInt()
    }
    println(num)
}