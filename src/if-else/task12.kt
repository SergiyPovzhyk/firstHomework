package `if-else`

fun main() {
    val year = 2020
    if(year % 4 != 0 || year % 100 == 0 && year % 400 !=0){
        println(365)
    }
    else{
        println(366)
    }
}