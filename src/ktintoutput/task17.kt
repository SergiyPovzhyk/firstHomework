package ktintoutput

fun main(){
    val x1 : Double = 4.0
    val x2 : Double = -5.0
    val y1 : Double = -1.0
    val y2 : Double = 5.0
    val sum : Double = (x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1)
    val sqrt = Math.sqrt(sum)
    println(sqrt)
}