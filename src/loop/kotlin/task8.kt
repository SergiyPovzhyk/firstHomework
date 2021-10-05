package loop.kotlin

fun main(){
    val num = 9
    var sum = 0
    var i = 1

    while(sum<num) {
        i=i+1
        sum +=i
    }
    println("Найменше число: $i")
    println("Сума: $sum")
}