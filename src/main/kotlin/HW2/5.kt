
package HW
//fun main(){
//    println("Введите четырёх значное число")
//    val num = readLine()!!.toInt()
//    val result: Boolean
//    if(num / 1000 +(num / 100) % 10 == (num % 100) / 10 + num / 1000){
//        result = true
//    } else{
//        result = false
//    }
//    println(result)
//}

fun main(){
    println("Введите четырёх значное число")
    val num = readLine()!!.toInt()
    val result: Boolean
    result = num / 1000 +(num / 100) % 10 == (num % 100) / 10 + num / 1000
    println(result)
}