package ktintoutput

fun main(){
    val x1 = 5
    val x2 = -4
    val y1 = -2
    val y2 = 7

    val ab = Math.abs(x2-x1)
    val bc = Math.abs(y2-y1)
    val p = 2*(ab + bc)
    val s = ab * bc
    println(p)
    println(s)
}