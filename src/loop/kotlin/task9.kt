package loop.kotlin

fun main(){
    val p:Double=7.0
    val vklad=1000
    var sum=vklad
    val sum1=1100
    var month=0


    while(sum<sum1) {
        month=month+1
        sum=(sum+sum*p/100).toInt()
    }

    println("Sum: $sum")
    println("month: $month")

}