package HW3

fun main(){
    val a = readLine()!!.toInt()
    val message =
        when {
            a % 2 == 0 -> "2"
            a % 5 ==0 -> "5"
            else -> "0"
        }
    println(message)
}